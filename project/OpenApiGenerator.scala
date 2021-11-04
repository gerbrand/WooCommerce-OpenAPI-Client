import sbt._
import Keys._
import org.apache.logging.log4j.LogManager

import java.io.PrintWriter
import sys.process._
import sbt.Keys.streams

// imports standard command parsing functionality
import complete.DefaultParsers._

/**
 * Commands for generating the openapi client
 *
 * Based on https://www.scala-sbt.org/1.x/docs/Commands.html#Full+Example
 */
object OpenApiGenerator {


  def replaceAll(toReplace:Map[String, String])(file:String) = {
    import scala.io.Source
    val content = Source.fromFile(file).mkString
    toReplace.foldLeft(content){case (c,(target,replacement)) => c.replaceAll(target,replacement)}
    val newContent = content.replaceAll("\"openapi-client\"","\"woocommerce-akka-client\"").replaceAll("\"org.openapitools\"","\"org.woocommerce\"")
    val writer = new PrintWriter(new File(file))
    writer.write(newContent)
    writer.close()
  }
  def generateAkkaClient = Command.command("generateAkkaClient") { state =>
    val log = state.log
    // Generate files, not doing anything with results yet
    val result = "openapi-generator-cli generate -g scala-akka -o woocommerce-akka-client -i src/main/resources/woocommerce-openapi.yml --additional-properties=mainPackage=org.woocommerce.akkaclient".!!
    log.info(result)
    // Some ugly search&replace, as I can't get the CLI to override the default group and name somehow.
    val files = Seq("woocommerce-akka-client/build.sbt","woocommerce-akka-client/pom.xml")
    val toReplace = Map("\"openapi-client\""->"\"woocommerce-akka-client\"","\"openapi-client\""->"\"woocommerce-akka-client\"")
    files.foreach(replaceAll(toReplace))
    state
  }
}
