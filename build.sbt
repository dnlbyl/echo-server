name := "finatra-echo"

version := "0.1"

scalaVersion := "2.13.5"

mainClass in (Compile, run) := Some("com.dnlbyl.finatra.echo.EchoServerMain")

idePackagePrefix := Some("com.dnlbyl")

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % "21.2.0",
)
