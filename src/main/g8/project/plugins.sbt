// Vaadin SBT plugin
resolvers += "sbt-vaadin-plugin repo" at "http://henrikerola.github.io/repository/releases"

addSbtPlugin("org.vaadin.sbt" % "sbt-vaadin-plugin" % "1.0.0")

// IDE plugin
resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")