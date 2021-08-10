name := "ScalaFixSimple"

version := "0.1"

scalaVersion := "2.12.14"

addCompilerPlugin(scalafixSemanticdb)

scalacOptions ++= List("-Yrangepos", "-P:semanticdb:synthetics:on")

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings"
)

libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.5.0"

ThisBuild / scalafixDependencies += "org.scala-lang.modules" %% "scala-collection-migrations" % "2.5.0"
