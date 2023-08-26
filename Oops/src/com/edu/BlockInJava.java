package com.edu;

public class BlockInJava {
	
	static {
		System.out.println("static block will executes before the main");
	}
	
	{
	
		System.out.println("annonymous block , executes after main , on object creation before constructor");
	}
	
	public BlockInJava(){
		System.out.println("constuctor");
	}
	
	static void display() {
		System.out.println("display method");
	}
	
	public static void main(String[] args) {
		 System.out.println("main");
		 BlockInJava ob = new BlockInJava();
		 // ob.display();
		 BlockInJava.display();
		 display();

	}
}