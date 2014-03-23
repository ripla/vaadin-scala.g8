package $package$

import vaadin.scala._

class $classname$UI extends UI(title = "$name$") {
	
	content = new VerticalLayout {
		margin = true
		components += Label("This Vaadin app uses Scaladin!")
	}
}