name := """hello-world"""
organization := "me.shenghan.gao"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "me.shenghan.gao.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "me.shenghan.gao.binders._"
