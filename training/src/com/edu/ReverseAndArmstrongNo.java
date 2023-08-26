package com.edu;

import java.util.Scanner;

public class ReverseAndArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter the no: ");
		int no = sc.nextInt();*/
		
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			int no = i;
			int orgno = i;
			
			while(no > 0) {
				int rem = no % 10;
				sum = sum + (rem * rem * rem);
				no = no / 10;
			}
			
			if (sum == orgno) {
				System.out.println(orgno);
			}
		}
	}
}
