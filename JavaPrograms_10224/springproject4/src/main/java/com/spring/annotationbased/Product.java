package com.spring.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Product {
	public void productDisplay() {
		System.out.println("Product Method");
	}
}
