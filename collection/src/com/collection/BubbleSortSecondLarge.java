package com.collection;

import java.util.Scanner;

public class BubbleSortSecondLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter position of large number: ");
		int in = sc.nextInt();
		
		int pos = in - 1;
		
	    int[] arr = {1,23,12,5,8,9};
	    int i,j;
	    int n = arr.length;
	    for (i = 0; i < n; i++) {     
	    	for (j = 0; j < n - i - 1; j++) {
	            if (arr[j] < arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
	            }
	         }
	    }  
	    System.out.println(arr[pos]);
	}
}
