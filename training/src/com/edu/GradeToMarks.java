package com.edu;

import java.util.Scanner;

public class GradeToMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Grade: ");
		char grade = sc.next().charAt(0);
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("Marks: 90 - 100");
		}
		else if (grade == 'B' || grade == 'b') {
			System.out.println("Marks: 70 - 89");
		}
		else if (grade == 'C' || grade == 'c') {
			System.out.println("Marks: 50 - 69");
		}
		else if (grade == 'D' || grade == 'd') {
			System.out.println("Marks: 0 - 50");
		}
		else {
			System.out.println("Invalid entry");
		}
	}

}
