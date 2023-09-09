package com.edu.exceptionhandling;

public class ThrowDemo {
	public static void main(String[] args) {
		int a = 10, b = 2, c = 0;
		
		try {
			if (b == 0) {
				throw new ArithmeticException("Denominator is Zero");
			}
			else {
				c = b / a;
				System.out.println("c is " + c);
			}
		}catch(ArithmeticException e){
			System.err.println("Error: ");
			e.printStackTrace();
		}
	}
}
