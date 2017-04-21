name := "datascience"

version := "1.0.4"

organization := "com.github.hupi-analytics"

scalaVersion := "2.10.4"




libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.5.0" % "provided"
)

useGpg := true


pomIncludeRepository := { _ => false }

licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))

homepage := Some(url("http://hupi.fr"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/hupi-analytics/DataScience"),
    "scm:git@github.com:hupi-analytics/DataScience.git"
  )
)

developers := List(
  Developer(
    id    = "bobba",
    name  = "bobba surendranath chowdary",
    email = "surendra.bobba@hupi.fr",
    url   = url("http://github.com/domitian")
  )
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false
