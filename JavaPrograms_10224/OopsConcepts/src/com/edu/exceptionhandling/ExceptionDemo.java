package com.edu.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		
		System.out.println("Before Division = " + c);
		try {
			c = a/b;
		}catch(ArithmeticException e){
			System.err.println("Cannot divide ");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("After Division = " + c);
		
		int[] arr = new int[4];
		try {
			arr[4] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Limit exceeded in array ");
			e.printStackTrace();
		}
	}

}
