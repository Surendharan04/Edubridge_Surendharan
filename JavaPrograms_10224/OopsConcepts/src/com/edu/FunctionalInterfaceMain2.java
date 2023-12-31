package com.edu;

@FunctionalInterface
interface Message1{
	void display();
}

@FunctionalInterface
interface Addition1{
	void add(int a, int b);
}

public class FunctionalInterfaceMain2{
	public static void main(String[] args) {
		//No argument and no return type
		/*Lambda expression can be applied only for functional interface
		which has single abstract method*/
		Message1 mob=()->{
			System.out.println("Display method called");
		};
		
		mob.display();
		
		Message1 mob1=()->System.out.println("Display method");
		mob1.display();
		
		//with argument and no return type
		Addition1 aob=(i, j)->{
			int s= i + j;
			System.out.println("Sum=" + s);
		};
		
		aob.add(9, 3);
		Addition1 aob1=(i, j)->System.out.println("Sum=" + (i + j));
		aob1.add(19, 3);
	}

}