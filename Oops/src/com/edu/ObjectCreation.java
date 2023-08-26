package com.edu;

import java.util.Scanner;

public class ObjectCreation {
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

	public static void main(String args[]){
	    ObjectCreation sob=new ObjectCreation();
		sob.input();
		sob.display(); 
		     
		ObjectCreation sob1=new ObjectCreation();
		sob1.input();
		sob1.display(); 	  
	}
}

