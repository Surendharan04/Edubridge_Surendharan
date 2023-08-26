package com.edu.Inheritance.pack1;

import com.edu.Inheritance.pack2.*;

class EmployeeClass extends HR{
	private int i;
	
	private void empPersonalDetails() {
		System.out.print("Employee Personal Details: ");
	}
	public void display() {
		System.out.print("Display method: "+i);
		empPersonalDetails();
	}
}

public class Employee {

	public static void main(String[] args) {
		EmployeeClass eob = new EmployeeClass();
		eob.display();
		
		/*HR hob=new HR();
		hob.input();
	    hob.display();*/
	}
}