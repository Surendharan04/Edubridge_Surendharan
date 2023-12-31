package com.edu;

import java.util.Scanner;

public class SmallDiscount {
	float discountedPrice = 0, pprice;
	String pname;

	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Product Name: ");
		pname = sc.nextLine();
		
		System.out.print("Enter the Price: ");
		pprice = sc.nextFloat();
	}
	
	public void calculateBill() {
		System.out.println("---\nProduct Name: " + pname);

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
		
		System.out.println("Discounted Price: " + discountedPrice);
	}
	
	public static void main(String[] args) {
		SmallDiscount obj = new SmallDiscount();
		
		obj.inputDetails();
		obj.calculateBill();
	}
}
