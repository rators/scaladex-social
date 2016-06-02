import sbt._
import Process._
import Keys._


lazy val root = (project in file(".")).
  settings(
    version := "0.1",
    scalaVersion := "2.10.2",
    assemblyJarName in assembly := "foo.jar"
  )
.enablePlugins(HelloPlugin)