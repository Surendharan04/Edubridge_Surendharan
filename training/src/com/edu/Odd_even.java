package com.edu;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int no = sc.nextInt();
		
		if (no % 2 ==0) {
			System.out.println("The number is even");
		}
		else if (no == 0) {
			System.out.println("Neither even nor odd");
		}
		else {
			System.out.println("The number is odd");
		}
	}
}
