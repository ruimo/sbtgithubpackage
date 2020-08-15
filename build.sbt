scalaVersion := "2.13.1"

name := "sbtgithubpackages"
organization := "com.ruimo"

libraryDependencies += "com.pi4j" % "pi4j-core" % "1.2"
libraryDependencies += "com.pi4j" % "pi4j-gpio-extension" %"1.2"

lazy val root = (project in file(".")).enablePlugins(UniversalDeployPlugin, JavaAppPackaging)

publishTo := Some(
  Resolver.file(
    "sbtgithubpackage",
    new File(Option(System.getenv("RELEASE_DIR")).getOrElse("/tmp"))
  )
)
