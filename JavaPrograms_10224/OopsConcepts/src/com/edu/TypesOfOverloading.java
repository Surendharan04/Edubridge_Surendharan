package com.edu;

public class TypesOfOverloading {
	
	static void max(int a, int b) {
		if (a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
	
	static void max(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a);
		}
		else if (b > a && b > c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
	
	void multiply(int a, double b) {
		int mul = (int)(a * b);	//Typecasted explicitly
		System.out.println("Integer Method: " + mul);
	}
	
	void multiply(double a, int b) {
		double mul = a * b;	//Typecasted implicitly
		System.out.println("Double Method: " + mul);
	}

	public static void main(String[] args) {
		TypesOfOverloading obj = new TypesOfOverloading();
		
		max(5, 8);
		max(8, 7, 10);
		
		obj.multiply(4, 5.0);
		obj.multiply(5.5, 12);
	}
}
