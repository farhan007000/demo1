import sbt.Keys.libraryDependencies

import scala.collection.Seq

version in ThisBuild := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.12"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.3",
  "org.apache.spark" %% "spark-sql" % "2.4.3"
)
lazy val root = (project in file("."))
  .settings(
    name := "Seekhobigdata"
  )
