package com.arrayprograms;

import java.util.Scanner;

public class LargestOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int largestSoFar = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the no: ");
			arr[i] = sc.nextInt();
			if (arr[i] > largestSoFar) {
				largestSoFar = arr[i];
			}
		}
		System.out.println("The largest element in the array is " + largestSoFar);
	}

}
