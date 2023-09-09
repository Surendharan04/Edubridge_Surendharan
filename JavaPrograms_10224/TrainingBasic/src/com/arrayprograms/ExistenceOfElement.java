package com.arrayprograms;

import java.util.Scanner;

public class ExistenceOfElement {

	public static void main(String[] args) {
		int[] arr = {12,58,69,33,9,64,48,57,25,36};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be searched: ");
		int search = sc.nextInt();
		boolean exist = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				exist = true;
				break;
			}
		}
		
		if (exist == true) {
			System.out.println("Element exists in the array");
		}
		else {
			System.out.println("Element does not exist");
		}
	}
}
