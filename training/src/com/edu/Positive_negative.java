package com.edu;

import java.util.Scanner;

public class Positive_negative {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no: ");
		int no = sc.nextInt();
		
		if (no > 0) {
			System.out.println("Positive");
		}
		else if (no == 0) {
			System.out.println("Neither Positive or Negative");
		}
		else {
			System.out.println("Negative");
		}
	}
}
