package com.edu;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		age = sc.nextInt();
		
		
		if (age >= 18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	}
}
