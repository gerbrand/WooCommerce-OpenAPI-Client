import Dependencies._
import OpenApiGenerator._
import sbt.Keys.organization

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "software-creation"
ThisBuild / organizationName := "software-creation"

resolvers += Resolver.mavenLocal
/**
 * Generated using the custom task generateAkkaClient.
 * See [[OpenApiGenerator]] for details
 *
 * See also [[https://www.software-creation.nl/2021/11/using-the-woocommerce-api]]
 */
lazy val akkaClient = (project in file("woocommerce-akka-client"))
  .settings(
    name := "woocommerce-akka-client",
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
lazy val javaClient = (project in file("woocommerce-java-client"))
  .settings(
    name := "woocommerce-java-client",
    organization := "org.woocommerce",
    name := "woocommerce-java-client",
    libraryDependencies := Seq(
      "io.swagger" % "swagger-annotations" % "1.5.24",
      "com.squareup.okhttp3" % "okhttp" % "4.9.1",
      "com.squareup.okhttp3" % "logging-interceptor" % "4.9.1",
      "com.google.code.gson" % "gson" % "2.8.6",
      "org.apache.commons" % "commons-lang3" % "3.10",
      "org.openapitools" % "jackson-databind-nullable" % "0.2.1",
      "org.threeten" % "threetenbp" % "1.4.3" % "compile",
      "io.gsonfire" % "gson-fire" % "1.8.3" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "junit" % "junit" % "4.13.1" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )

lazy val example = (project in file("example"))
  .settings(
    name := "woocommerce-example",
    organization := "org.woocommerce",
    libraryDependencies ++= Seq(),
  ).dependsOn(akkaClient, javaClient)

lazy val root = (project in file("."))
  .settings(
    name := "woocommerce-scala-client",
    libraryDependencies += scalaTest % Test,
    commands ++= Seq(generateAkkaClient, generateJavaClient)
  )
  .aggregate(akkaClient, javaClient, example)

//publishArtifact in (Compile, packageDoc) := false

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
