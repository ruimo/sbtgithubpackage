scalaVersion := "2.13.1"

name := "sbtgithubpackages"
organization := "com.ruimo"
version := "1.0-SNAPSHOT"

libraryDependencies += "com.pi4j" % "pi4j-core" % "1.2"
libraryDependencies += "com.pi4j" % "pi4j-gpio-extension" %"1.2"

githubOwner := "ruimo"
githubRepository := "sbtgithubpackage"

lazy val root = (project in file(".")).enablePlugins(UniversalDeployPlugin, JavaAppPackaging)
