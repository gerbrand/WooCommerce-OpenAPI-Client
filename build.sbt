import Dependencies._
import OpenApiGenerator._
import sbt.Keys.organization

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "software-creation"
ThisBuild / organizationName := "software-creation"

resolvers ++= Seq(Resolver.mavenLocal)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

publishArtifact in (Compile, packageDoc) := false

/**
 * Generated using the custom task generateAkkaClient.
 * See [[OpenApiGenerator]] for details
 *
 * See also [[https://www.software-creation.nl/2021/11/using-the-woocommerce-api]]
 */
lazy val akkaClient = (project in file("woocommerce-scala-akka-client"))
  .settings(
    name := "woocommerce-scala-akka-client",
    organization := "org.woocommerce",
    libraryDependencies := Seq(
      "com.typesafe" % "config" % "1.4.1",
      "com.typesafe.akka" %% "akka-actor" % "2.6.12",
      "com.typesafe.akka" %% "akka-stream" % "2.6.12",
      "com.typesafe.akka" %% "akka-http" % "10.2.3",
      "org.json4s" %% "json4s-jackson" % "3.6.7",
      "org.json4s" %% "json4s-ext" % "3.6.7",
      "de.heikoseeberger" %% "akka-http-json4s" % "1.27.0",
      "org.scala-lang.modules" %% "scala-collection-compat" % "2.4.1",
      // test dependencies
      "org.scalatest"     %% "scalatest"  % "3.2.3"   % "test",
      "org.scalatestplus" %% "junit-4-13" % "3.2.3.0" % "test"
    )
  )

lazy val example = (project in file("example"))
  .settings(
    name := "woocommerce-example",
    organization := "org.woocommerce",
    libraryDependencies ++= Seq(),
  ).dependsOn(akkaClient)

lazy val root = (project in file("."))
  .settings(
    name := "woocommerce-openapi-client",
    libraryDependencies += scalaTest % Test,
    commands ++= Seq(generateOpenAPIClient, generateAkkaClient)
  )
  .aggregate(akkaClient, example)

//publishArtifact in (Compile, packageDoc) := false

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
