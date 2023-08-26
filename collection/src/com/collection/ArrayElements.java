package com.collection;

import java.util.Scanner;

public class ArrayElements {

	public static void main(String[] args) {
		int[] rollno = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + rollno.length + " roll numbers");
		
		for (int i = 0; i < rollno.length; i++) {
			System.out.print("Enter the roll no: ");
			rollno[i] = sc.nextInt();
		}
		
		System.out.println("Entered Roll Numbers are: ");
		for (int i = 0; i < rollno.length; i++) {
			System.out.println(rollno[i]);
		}
	}
}
