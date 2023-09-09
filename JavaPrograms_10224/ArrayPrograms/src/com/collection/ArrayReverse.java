package com.collection;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered Elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
