name := "Kittu Scala"

version := "1.0"

scalaVersion :="2.11.8"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
"org.apache.spark" % "spark-core_2.11" % "2.3.1",
"org.apache.spark" % "spark-sql_2.11" % "2.3.1"
)