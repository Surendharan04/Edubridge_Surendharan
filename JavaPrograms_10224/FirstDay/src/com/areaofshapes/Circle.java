package com.areaofshapes;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		float pi, radius, area;
		
		pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		radius = sc.nextFloat();
		
		area = pi * (radius * radius);
		
		System.out.println("Area of Circle is "+ area + " sq.m");
	}
}
