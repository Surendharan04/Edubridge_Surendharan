package com.edu;

import java.util.Scanner;

public class EmployeeDetails {
	int empId, empAge;
	String empName;
	
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the ID:");
		empId = sc.nextInt();
		
		System.out.print("Enter the Age: ");
		empAge = sc.nextInt();
		
		System.out.print("Enter the Name: ");
		empName = sc.next();
	}
	
	void displayDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Age: " + empAge);
	}
	
	public static void main(String[] args) {
		EmployeeDetails ed1 = new EmployeeDetails();
		EmployeeDetails ed2 = new EmployeeDetails();
		
		ed1.getDetails();
		ed1.displayDetails();
		
		ed2.getDetails();
		ed2.displayDetails();
	}
}
