name := "$name$"

scalaVersion := "$scalaVersion$"

seq(vaadinWebSettings: _*)

resolvers += "Vaadin add-ons repository" at "http://maven.vaadin.com/vaadin-addons"

// basic dependencies
libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-server" % "$vaadinVersion$",
  "com.vaadin" % "vaadin-client-compiled" % "$vaadinVersion$",
  "com.vaadin" % "vaadin-themes" % "$vaadinVersion$",
  "org.vaadin.addons" % "scaladin" % "$scaladinVersion$",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.3.v20140225" % "container",
  "org.eclipse.jetty" % "jetty-annotations" % "9.1.3.v20140225" % "container"
)

libraryDependencies ++= Seq(
	//Add add-ons from the directory here. e.g.
	//"com.vaadin.addon" % "vaadin-charts" % "1.1.5"
)

// Settings for the Vaadin plugin widgetset compilation
// Widgetset compilation needs memory and to avoid an out of memory error it usually needs more memory:
javaOptions in compileVaadinWidgetsets := Seq("-Xss8M", "-Xmx512M", "-XX:MaxPermSize=512M")

vaadinOptions in compileVaadinWidgetsets := Seq("-logLevel", "DEBUG", "-strict")

// Compile widgetsets into the source directory (by default themes are compiled into the target directory)
target in compileVaadinWidgetsets := (sourceDirectory in Compile).value / "webapp" / "VAADIN" / "widgetsets"

// This makes possible to attach a remote debugger when development mode is started from the command line
// javaOptions in vaadinDevMode ++= Seq("-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005")