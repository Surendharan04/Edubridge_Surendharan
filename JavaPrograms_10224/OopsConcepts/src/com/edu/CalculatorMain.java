package com.edu;

import java.util.Scanner;

interface Calculator{
	void add();
	void subtract();
	void multiply();
	void divide();
	
	void input();
}

class CalculatedImpl implements Calculator{
	float ans, a, b;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		a = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		b = sc.nextInt();
	}
	
	public void add() {
		ans = a + b;
		System.out.println("Addition: " + ans);
	}
	
	public void subtract() {
		ans = a - b;
		System.out.println("Subtraction: " + ans);
	}
	
	public void multiply() {
		ans = a + b;
		System.out.println("Multiplication: " + ans);
	}
	
	public void divide() {
		if (b == 0) {
			System.out.println("Divisor is Zero");
		}
		else {
			ans = a / b;
			System.out.println("Division: " + ans);
		}
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatedImpl obj = new CalculatedImpl();
		
		obj.input();
		
		obj.add();
		obj.subtract();
		obj.multiply();
		obj.divide();
	}

}
