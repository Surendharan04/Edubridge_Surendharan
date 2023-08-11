package com.edu;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First No: ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second No: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("First number is largest");
		}
		else {
			System.out.println("Second number is largest");
		}
	}

}
