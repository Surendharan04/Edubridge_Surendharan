package com.edu;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no = sc.nextInt();
		int orgno = no;
		
		int rev = 0;
		
		while(no != 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reversed no: " + rev);
		
		if (rev == orgno) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
