import aether.AetherKeys._

scalaVersion := "2.13.1"

name := "sbtgithubpackages"
organization := "com.ruimo"
version := "1.0-SNAPSHOT"

libraryDependencies += "com.pi4j" % "pi4j-core" % "1.2"
libraryDependencies += "com.pi4j" % "pi4j-gpio-extension" %"1.2"

githubOwner := "ruimo"
githubRepository := "sbtgithubpackage"

crossPaths := false //needed if you want to remove the scala version from the artifact name

aetherArtifact := {
    val artifact = aetherArtifact.value
    artifact.attach((packageBin in Universal).value, "dist", "zip")
}

lazy val root = (project in file(".")).enablePlugins(UniversalDeployPlugin, JavaAppPackaging)
