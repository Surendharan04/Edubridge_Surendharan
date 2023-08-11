package com.edu;

import java.util.Scanner;

public class Employee_Data {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int e_id, e_age;
		String e_name, dept;
		float e_salary;
		char gender;

		System.out.print("Enter Employee ID: ");
		e_id = sc.nextInt();
		
		System.out.print("Enter the Age: ");
		e_age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the Name: ");
		e_name = sc.nextLine();
		
		System.out.print("Enter the Department: ");
		dept = sc.next();
		
		System.out.print("Enter the Salary: ");
		e_salary = sc.nextFloat();
		
		System.out.print("Enter the Gender: ");
		gender = sc.next().charAt(0);
		
		sc.close();
		
		System.out.println("Data----------------------------");
		System.out.println("ID: " + e_id);
		System.out.println("Name: " + e_name);
		System.out.println("Department: " + dept);
		System.out.println("Salary: " + e_salary);
		System.out.println("Age: " + e_age);
		System.out.println("Gender: " + gender);
	}
}
