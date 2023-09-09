package com.creativeprograms;

public class LastThreePrime {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 100; i >= 0; i--) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if (count == 2) {
				counter++;
				System.out.print(i + " ");
				if(counter == 3) {
					break;
				}
			}
		}
	}
}