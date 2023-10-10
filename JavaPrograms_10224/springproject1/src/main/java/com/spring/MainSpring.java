package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		//For Spring the object should be inserted by dependency injection
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("springcontext.xml");
		Student s = (Student) appcontext.getBean("sobj");
		s.display();
	}
}
