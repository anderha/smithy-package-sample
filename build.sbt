name := "smithy-package-sample"

version := "0.1"

lazy val root = (project in file("."))
  .enablePlugins(Smithy4sCodegenPlugin)
  .settings(
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "com.disneystreaming.smithy4s" %% "smithy4s-core" % "0.14.2",
      "com.disneystreaming.smithy4s" %% "smithy4s-json" % "0.14.2",
      "anderha.smithy-package-sample" %% "api-definition" % "0.0.1" % Smithy4s
    ),
    Compile / smithy4sInputDir := (ThisBuild / baseDirectory).value / "src" / "main" / "scala" / "smithy" / "input",
    Compile / smithy4sOutputDir := (ThisBuild / baseDirectory).value / "src" / "main" / "scala" / "smithy" / "output"
  )

lazy val apiDefinition = project in file("modules/api-definition")
