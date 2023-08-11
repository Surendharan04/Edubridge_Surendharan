package com.edu;

import java.util.Scanner;

public class SmallDiscount {
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Product Name: ");
		String pname = sc.nextLine();
		
		System.out.print("Enter the Price: ");
		float pprice = sc.nextFloat();
	}
	
	void calculateBill() {
		if (pprice >=0 && pprice<= 1000) {
			discountedPrice = pprice - (pprice * 2/100);
		}
		else if (pprice > 1000 && pprice <= 3000) {
			discountedPrice = pprice - (pprice * 10/100);
		}
		else if (pprice > 3000) {
			discountedPrice = pprice - (pprice * 15/100);
		}
		else {
			System.out.println("Invalid entry");
		}
	}
	
	public static void main(String[] args) {
		
		float discountedPrice = 0;
		
		System.out.println("Product Name: " + pname);
		System.out.println("Discounted Price: " + discountedPrice);
	}
}
