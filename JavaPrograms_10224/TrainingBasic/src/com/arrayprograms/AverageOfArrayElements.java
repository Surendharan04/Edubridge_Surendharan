package com.arrayprograms;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		int sum = 0;
		int avg;
		int[] avgArr = new int[size];
		
		for (int i = 0; i < avgArr.length; i++) {
			System.out.print("Enter Number: ");
			avgArr[i] = sc.nextInt();
			sum += avgArr[i];
		}
		
		avg = sum / avgArr.length;
		System.out.println("Average of Elements: " + avg);
	}

}
