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
    val newContent = toReplace.foldLeft(content){case (c,(target,replacement)) => c.replaceAll(target,replacement)}
    val writer = new PrintWriter(new File(file))
    writer.write(newContent)
    writer.close()
  }
  def generateAkkaClient = Command.command("generateAkkaClient") { state =>
    val log = state.log
    // Generate files using openapitools.json file
    val result = "openapi-generator-cli generate".!!
    log.info(result)
    // Some ugly search&replace of the default scala version, so the submodule's scala version is the same as the main module
    // Hadn't find out yet how to update this via the config file openapitools.json
    val files = Seq("woocommerce-akka-client/build.sbt")
    val toReplace = Map("scalaVersion := \"2.12.13\""->"scalaVersion := \"2.13.6\"", "Seq(scalaVersion.value, \"2.13.4\")"-> "Seq(scalaVersion.value, \"2.12.13\")")
    files.foreach(replaceAll(toReplace))
    state
  }
}
