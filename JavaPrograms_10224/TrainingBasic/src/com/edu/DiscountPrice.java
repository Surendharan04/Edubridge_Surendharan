package com.edu;

import java.util.Scanner;

public class DiscountPrice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Product Name: ");
		String pname = sc.nextLine();
		
		System.out.print("Enter the Price: ");
		float pprice = sc.nextFloat();
		
		float discountedPrice = 0;
		
		if (pprice >=0 && pprice<= 10000) {
			discountedPrice = pprice - (pprice * 5/100);
		}
		else if (pprice > 10000 && pprice <= 20000) {
			discountedPrice = pprice - (pprice * 10/100);
		}
		else if (pprice > 20000 && pprice <= 35000) {
			discountedPrice = pprice - (pprice * 15/100);
		}
		else if (pprice >35000) {
			discountedPrice = pprice - (pprice * 20/100);
		}
		else {
			System.out.println("Invalid entry");
		}
		
		System.out.println("Product Name: " + pname);
		System.out.println("Discounted Price: " + discountedPrice);
	}
}
