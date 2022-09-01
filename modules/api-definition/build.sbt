val releaseVersion = "0.0.1"

lazy val apiDefinition = (project in file("."))
  .settings(
    name := "api-definition",
    scalaVersion := "2.13.8",
    organization := "anderha.smithy-package-sample",
    version := releaseVersion
  )