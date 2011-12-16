import sbt._
import Keys._
import com.github.siasia.WebPlugin._

object BuildSettings {
  val buildSettings = Defaults.defaultSettings ++ Seq(
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-encoding", "UTF-8"),
    autoScalaLibrary := true,	organization := "$package$", version := "0.1-SNAPSHOT",
	scalaVersion := "2.9.1")
}

object Resolvers {
 val vaadinAddons = "Vaadin add-ons repository" at "http://maven.vaadin.com/vaadin-addons"
}

object Dependencies {
  val vaadinVersion = "6.7.2"
  val jettyVersion = "7.3.0.v20110203"
  val scalaWrappersVersion = "0.1"

  val vaadin = "com.vaadin" % "vaadin" % vaadinVersion
  val jetty = "org.eclipse.jetty" % "jetty-webapp" % jettyVersion % "container"
  val scalaWrappers = "org.vaadin.addons" % "scala-wrappers" % scalaWrappersVersion

}

object $classname$Build extends Build {
  import Dependencies._
  import BuildSettings._
  import Resolvers._

  val buildSettings = Project.defaultSettings ++ Seq(libraryDependencies := Seq(vaadin, scalaWrappers)) ++ Seq(resolvers := Seq(vaadinAddons))

  lazy val root = Project(id = "$classname$", base = file("."), settings = buildSettings)
}
