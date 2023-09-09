package com.collection;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Sum of elements: " + sum);
	}
}
