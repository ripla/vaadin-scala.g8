package $package$

import vaadin.scala._

class $classname$Application extends Application("$name$") {
	override val main: ComponentContainer = new VerticalLayout {
		margin = true
		components += Label("This Vaadin app uses Scaladin!")
	}
}