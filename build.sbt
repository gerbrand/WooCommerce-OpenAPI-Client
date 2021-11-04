import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "software-creation"
ThisBuild / organizationName := "software-creation"

lazy val akkaClient = (project in file("woocommerce-akka-client"))
  .settings(
    name := "WooCommerce Akka Client"
  )

lazy val root = (project in file("."))
  .settings(
    name := "WooCommerce Client",
    libraryDependencies += scalaTest % Test
  )
  .aggregate(akkaClient)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
