package com.edu;

import java.util.Scanner;

class Employee{
	int age;
	String name;
	void input(){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter student name");
	    name = sc.nextLine();
	     
	    System.out.println("Enter age");
	    age = sc.nextInt();
	}
	void display(){
	    System.out.println("Name ="+name);
	    System.out.println("Age="+age);
	}  
}

class HR{ 
	 void displayHr(Employee e1) {
		 System.out.println("Employee details");
		 System.out.println("name="+e1.name);
		 System.out.println("age="+e1.age);
	 }
}

public class Referencing{  
	public static void main(String args[]){
		Employee eob=new Employee();
		eob.input();
		HR hob=new HR();
		hob.displayHr(eob);
	}
}
