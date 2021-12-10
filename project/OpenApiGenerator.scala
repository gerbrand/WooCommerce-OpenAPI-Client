import sbt._
import Keys.{state, streams, _}
import org.apache.logging.log4j.LogManager

import java.io.PrintWriter
import sys.process._
import sbt.internal.util.ManagedLogger

// imports standard command parsing functionality
import complete.DefaultParsers._

/**
 * Commands for generating the openapi client
 *
 * Based on https://www.scala-sbt.org/1.x/docs/Commands.html#Full+Example
 */
object OpenApiGenerator {

  def generateOpenAPIClient = Command.args("generateClient", "<generator>") { (state, args) =>
    val generator = args.headOption.getOrElse("java")

    val additionalProperties = if (args.length>1) args(1) else s"mainPackage=org.woocommerce.${generator}client,artifactId=woocommerce-${generator}-client,groupId=org.woocommerce"
    generateClient(state, generator, additionalProperties)
    state
  }

  def generateAkkaClient = Command.command("generateAkkaClient") { state =>
    val log = state.log
    // Generate files using openapitools.json file
    generateClient(state, "scala-akka", "mainPackage=org.woocommerce.akkaclient,artifactId=woocommerce-akka-client,groupId=org.woocommerce,legacyDiscriminatorBehavior=false")
    // Deleting build files, as we define dependencies in the build.sbt of the root, avoid any scala compiler mismatches
    val buildFiles = List[String]("pom.xml", "build.sbt").map(b => new File("woocommerce-scala-akka-client", b))
    buildFiles.foreach(_.delete())
    // TODO should this be added to the generated code?
    state
  }

  private def generateClient(state: State, generator: String, additionalProperties: String): List[File] = {

    // Generate files using openapitools.json file
    val openapiCommand = s"openapi-generator-cli generate -g ${generator} -o woocommerce-${generator}-client -i src/main/resources/woocommerce-openapi-3.0.x.yml --additional-properties=${additionalProperties}"
    val result = openapiCommand.!!
    state.log.info(s"Executing: ${openapiCommand}")
    state.log.info(result)
    result.split("\n").filter(n => n.contains("writing file ") && n.contains("src/")).map(l => {

      new File(l.substring(l.indexOf("writing file ")+"writing file ".length))
    }).toList
  }
}
