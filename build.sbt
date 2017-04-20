name := "DataScienceTools"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.5.0" % "provided"
)

useGpg := true

pomIncludeRepository := { _ => false }

licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))

homepage := Some(url("http://example.com"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/hupi-analytics/DataScience"),
    "scm:git@github.com:hupi-analytics/DataScience"
  )
)

developers := List(
  Developer(
    id    = "bobba",
    name  = "bobba surendranath chowdary",
    email = "surendra.bobba@hupi.fr",
    url   = url("http://hupi.fr")
  )
)