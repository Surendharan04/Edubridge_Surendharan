package com.creativeprograms;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Units: ");
		int unit = sc.nextInt();
		
		float amount = 0;
		
		if (unit >= 0 && unit <= 200) {
			amount = unit * 3.80f;
			System.out.println("Rate is 3.80 Rupees/unit");
		}
		else if (unit > 200 && unit <= 300) {
			amount = (200 * 3.80f) + ((unit % 200) * 4.40f);
			System.out.println("Rate is 4.40 Rupees/unit");
		}
		else if (unit > 300 && unit <= 400) {
			amount = (200 * 3.80f) + (100 * 4.40f) + ((unit % 300) * 5.10f);
			System.out.println("Rate is 5.10 Rupees/unit");
		}
		else if (unit > 400) {
			amount = (200 * 3.80f) + (100 * 4.40f) + (100 * 5.10f) + ((unit % 400) * 5.80f);
			System.out.println("Rate is 5.80 Rupees/unit");
		}
		else {
			System.out.println("!!!");
		}
		
		System.out.println("Customer: " + name);
		System.out.println("Units consumed: " + unit);
		System.out.println("The bill is " + amount + " rupees");
	}
}
