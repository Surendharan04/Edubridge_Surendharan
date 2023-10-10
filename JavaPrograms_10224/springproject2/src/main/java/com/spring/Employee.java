package com.spring;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	Scanner sc = new Scanner(System.in);

	public int getId() {
		System.out.print("Enter your ID: ");
		int id = sc.nextInt();
		return id;
	}
	
	public String getName() {
		System.out.print("Enter your name: ");
		String name = sc.next();
		return name;
	}
	
	public void getDetails() {
		int id = getId(); 
		String name = getName();
		System.out.println("Employee ID: " +id+ " and Name is " +name);
	}
	
	public void displayEmployee() {
		System.out.println("Hello " +name+ ". Your Age is " + age);
	}
}
