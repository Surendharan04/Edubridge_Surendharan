package com.arrayprograms;

import java.util.Scanner;

public class SumOfDiagonalElements{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next().toLowerCase();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
