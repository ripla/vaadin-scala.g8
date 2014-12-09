// Vaadin SBT plugin
resolvers += "sbt-vaadin-plugin repo" at "http://henrikerola.github.io/repository/releases"

// IDE plugin and others
resolvers += Classpaths.typesafeReleases

addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.9.0")

addSbtPlugin("org.vaadin.sbt" % "sbt-vaadin-plugin" % "1.0.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")