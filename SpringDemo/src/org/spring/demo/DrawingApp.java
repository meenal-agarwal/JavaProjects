package org.spring.demo;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle mytriangle = new Triangle();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		mytriangle.draw();
		Triangle triangle = (Triangle) context.getBean("mytriangle");
		triangle.draw();
	
	}

}
