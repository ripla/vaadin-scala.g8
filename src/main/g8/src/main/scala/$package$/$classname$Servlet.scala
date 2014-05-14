package $package$

import vaadin.scala.server.ScaladinServlet
import javax.servlet.annotation.{WebInitParam, WebServlet}

@WebServlet(urlPatterns = Array("/*"), initParams = Array(new WebInitParam(name = "ScaladinUI", value ="$package$.$classname$UI")))
class $classname$Servlet extends ScaladinServlet