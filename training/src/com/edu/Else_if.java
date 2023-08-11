package com.edu;

import java.util.Scanner;

public class Else_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Mark: ");
		int mark = sc.nextInt();
		
		if (mark <= 100 && mark >= 90) {
			System.out.println("A");
		}
		else if (mark < 90 && mark >= 70) {
			System.out.println("B");
		}
		else if(mark < 70 && mark >= 50) {
			System.out.println("C");
		}
		else if(mark < 50 && mark >= 0) {
			System.out.println("D");
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
}
