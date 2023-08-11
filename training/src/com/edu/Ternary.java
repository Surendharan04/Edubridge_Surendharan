package com.edu;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		
		System.out.print("Enter d: ");
		int d = sc.nextInt();
		
		int max = (a > b && a > c && a > d)? a : (b > a && b > c && b > d)? b : (c > a && c > b && c > d)?c : d;
		
		System.out.println("The largest of " +a+ " , " +b+ " , " +c+ " and " +d+ " is " + max);
	}
}
