package com.edu;

import java.util.Scanner;
import java.util.function.Function;

@FunctionalInterface
interface Validation{
	boolean checkUser(String name, String pass);
}

public class FunctionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string = sc.nextLine();
		
		Function<String, Integer> func = (str) -> str.length();
		Function<String, String> funclow = (str) -> str.toLowerCase();
		Function<String, String> funcup = (str) -> str.toUpperCase();
		
		int len = func.apply(string);
		String low = funclow.apply(string);
		String up = funcup.apply(string);
		
		System.out.println("Length is " + len);
		System.out.println("Lowercase: " + low);
		System.out.println("Uppercase: " + up);
		
		
		//Check Credentials
		String orgName = "Edubridge";
		String orgPass = "admin";
		
		System.out.print("Enter the Username: ");
		String username = sc.next();
		System.out.print("Enter the Password: ");
		String password = sc.next();
		
		Validation valid = (String name, String pass) -> (name.equalsIgnoreCase(orgName) && pass.equals(orgPass));
			
		if (valid.checkUser(username, password)) {
			System.out.println("Username and password are correct");
		}
		else {
			System.out.println("Username and password are not correct");
		}
	}
}
