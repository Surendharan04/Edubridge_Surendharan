package com.edu;
import java.util.Scanner;

public class MaxOfAge {
    int age;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.next();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("Name =" + name);
        System.out.println("Age=" + age);
    }

    @Override
	public String toString() {
		return "Name=" + name +", Age=" + age;
	}

	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        MaxOfAge[] students = new MaxOfAge[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i] = new MaxOfAge(); // Creating a new student object
            students[i].input();
        }

        System.out.println("Student Information:");
        int maxAge = 0;
        String student = null;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display(); 
            if (students[i].age > maxAge) {
            	maxAge = students[i].age;
            	student = students[i].toString();
            }
        }
        System.out.println("Maximum age StudentInfo: \n" + student);

        scanner.close();
    }
}