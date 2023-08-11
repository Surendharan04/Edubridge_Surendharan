package com.edu;

import java.util.Scanner;

class Student{
  int studentid;
  String studentname;
  int studentage;
  
  void inputStudentDetails() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter the StudentID: ");
	  studentid = sc.nextInt();
	  
	  System.out.print("Enter the StudentName: ");
	  studentname = sc.next();
	  
	  System.out.print("Enter the StudentAge: ");
	  studentage = sc.nextInt();
  }
  
  void displayStudentDetails(){
     System.out.println("Student id ="+studentid);
     System.out.println("Student name="+studentname);
     System.out.println("Student age ="+studentage);
   }

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}
}

public class Mainapp{
     public static void main(String args[]){
          System.out.println("Main");
         
          Student sob = new Student();
          
          sob.inputStudentDetails();
          sob.displayStudentDetails();
          System.out.println(sob);
          }
}

