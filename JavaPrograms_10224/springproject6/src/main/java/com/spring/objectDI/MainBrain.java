package com.spring.objectDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBrain {
	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("springcontext.xml");
		Body body = (Body) appcontext.getBean("body");
		body.humanIsAlive();
	}
}
