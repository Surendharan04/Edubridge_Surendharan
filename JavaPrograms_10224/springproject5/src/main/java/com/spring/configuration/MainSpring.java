package com.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp = (Employee) appcontext.getBean("employee");
		emp.helloEmployee();
	}
}
