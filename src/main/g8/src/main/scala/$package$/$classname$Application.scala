package $package$

import com.vaadin.Application
import vaadin.scala._


class $classname$Application extends Application {
	def init(): Unit = {
		setMainWindow(new Window("$name$"))
		getMainWindow.addComponent(new Label("This Vaadin app uses ScalaWrappers!"))
	}
}