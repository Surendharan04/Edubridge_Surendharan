package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader {
   public static void main(String[] args) throws NumberFormatException, IOException {
	     int id;
		 String name;
		 float fees;
		 char gender;
		 
		 /*InputStreamReader isr = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(isr);*/
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //read()-> Gives the ASCII value of the character
		 //readLine() -> Reads a String value
		 
		 System.out.print("Enter the Student ID: ");
		 id = Integer.parseInt(br.readLine()); 
		 // Even if we enter a integer value it will change to String - "70" 
		 
		 System.out.print("Enter the Name: ");
		 name=br.readLine();
		 
		 System.out.print("Enter the Fees: ");
		 fees = Float.parseFloat(br.readLine());
		 
		 System.out.print("Enter the Gender: ");
		 gender = (char)br.read();
		 
		 System.out.println("Student Details----------");
		 System.out.println("ID: " + id);
		 System.out.println("Name: " + name);
		 System.out.println("Fees: " + fees);
		 System.out.println("Gender: " + gender);
	}	
}

