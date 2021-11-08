import Dependencies._
import OpenApiGenerator._
import sbt.Keys.organization

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "software-creation"
ThisBuild / organizationName := "software-creation"

/**
 * Generated using the custom task generateAkkaClient.
 * See [[OpenApiGenerator]] for details
 *
 * See also [[https://www.software-creation.nl/2021/11/using-the-woocommerce-api]]
 */
lazy val akkaClient = (project in file("woocommerce-akka-client"))
  .settings(
    name := "woocommerce-akka-client",
    organization := "org.woocommerce"
  )
lazy val sttpClient = (project in file("woocommerce-sttp-client"))
  .settings(
    name := "woocommerce-sttp-client",
    organization := "org.woocommerce"
  )

lazy val example = (project in file("example"))
  .settings(
    name := "woocommerce-example",
    organization := "org.woocommerce",
    libraryDependencies ++= Seq(),
  ).dependsOn(akkaClient, sttpClient)

lazy val root = (project in file("."))
  .settings(
    name := "woocommerce-scala-client",
    libraryDependencies += scalaTest % Test,
    commands ++= Seq(generateAkkaClient, generateSttplient)
  )
  .aggregate(akkaClient, sttpClient, example)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
