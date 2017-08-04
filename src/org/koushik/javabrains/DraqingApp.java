package org.koushik.javabrains;


import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class DraqingApp {
	
	/**
	 * 
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		triangle.setPointA(new Point());
		
		triangle.draw();

	}

}
