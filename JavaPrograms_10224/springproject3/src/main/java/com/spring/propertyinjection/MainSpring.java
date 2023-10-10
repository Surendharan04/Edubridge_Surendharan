package com.spring.propertyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("springcontext.xml");

		Vehicle car1 = (Vehicle) appContext.getBean("vehicle1");
		Vehicle car2 = (Vehicle) appContext.getBean("vehicle2");
		Vehicle bus1 = (Vehicle) appContext.getBean("vehicle3");

		car1.vehicleDisplay();
		car2.vehicleDisplay();
		bus1.vehicleDisplay();
	}
}
