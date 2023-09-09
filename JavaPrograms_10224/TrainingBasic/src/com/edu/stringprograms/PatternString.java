package com.edu.stringprograms;
import java.util.Scanner;

public class PatternString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.substring(0, i+1));
		}
		
		for (int i = word.length(); i >= 1; i--) {
			System.out.println(word.substring(0, i));
		}
	}

}
