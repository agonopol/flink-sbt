
libraryDependencies += "org.apache.flink" % "flink-scala" % "0.8.0"

libraryDependencies += "org.apache.flink" % "flink-streaming-scala" % "0.8.0"

libraryDependencies += "org.apache.flink" % "flink-clients" % "0.8.0"

libraryDependencies += "io.spray" %%  "spray-json" % "1.3.1"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

lazy val commonSettings = Seq(
  organization := "com.here",
  version := "0.1.0",
  scalaVersion := "2.10.4"
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(name := "swift-eta")