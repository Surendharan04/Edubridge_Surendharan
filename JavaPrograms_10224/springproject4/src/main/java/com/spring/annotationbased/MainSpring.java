package com.spring.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("springcontext.xml");
		Product product = (Product) appcontext.getBean("product");
		product.productDisplay();
	}
}
