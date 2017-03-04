
name := "dictionary"

version := "1.0.0"

val akkaVersion = "2.4.11"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.1.2",
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion
)

scalacOptions := Seq("-unchecked", "-deprecation", "-Xexperimental")

resolvers ++= Seq(
  "Typesafe Simple Repository" at "http://repo.typesafe.com/typesafe/simple/maven-releases/"
)

