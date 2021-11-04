import Dependencies._
import sbt.Keys.organization

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "software-creation"
ThisBuild / organizationName := "software-creation"

/**
 * Generated using:
 *
 * ``` openapi-generator-cli generate -g scala-akka -o woocommerce-akka-client -i src/main/resources/woocommerce-openapi.yml --additional-properties=mainPackage=org.woocommerce.akka-client```
 *
 * See also [[https://www.software-creation.nl/2021/11/using-the-woocommerce-api]]
 */
lazy val akkaClient = (project in file("woocommerce-akka-client"))
  .settings(
    name := "woocommerce-akka-client",
    organization := "org.woocommerce"
  )

lazy val root = (project in file("."))
  .settings(
    name := "woocommerce-scala-client",
    libraryDependencies += scalaTest % Test
  )
  .aggregate(akkaClient)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
