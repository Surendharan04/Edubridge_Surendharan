package com.arrayprograms;

import java.util.Scanner;

public class SmallestOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		//int smallestSoFar = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the no: ");
			arr[i] = sc.nextInt();
		}
		int smallestSoFar = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallestSoFar) {
				smallestSoFar = arr[i];
			}
		}
		
		System.out.println("Smallest element in the array is " + smallestSoFar);
	}

}
