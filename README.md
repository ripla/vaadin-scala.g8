# A simple Scala & Vaadin project template

## Installation

First you need install [g8](http://github.com/n8han/giter8). See their page for instructions. Then just drop in to a shell:

	g8 ripla/vaadin-scala
	<answer questions, enter for defaults>
	cd <project dir>
	sbt
	container:start

And browse to http://localhost:8080. You can also type *eclipse* in the SBT-prompt to create Eclipse project files and import the project to Eclipse as an existing project.

## What's included

This template creates an [SBT](https://github.com/harrah/xsbt/wiki) project that includes [Scala](http://www.scala-lang.org/), [Vaadin](http:/vaadin.com) and [ScalaWrappers](http://vaadin.com/addon/scala-wrappers). It also includes the SBT-plugins [xsbt-web-plugin](https://github.com/siasia/xsbt-web-plugin) for Jetty and [sbteclipse](https://github.com/typesafehub/sbteclipse) for creating Eclipse projects