package com.edu;

@FunctionalInterface
interface Message{
	void display();
}

public class FunctionalInterfaceMain {
	public static void main(String[] args) {
		//No argument and no return type
		//Lambda expression can be applied only for functional interface
		//which has single abstract method
		Message mob= () -> {
			System.out.println("Display method called");
		};
		
		mob.display();
		
		Message mob1= () -> System.out.println("Display method");
		mob1.display();
	}
}