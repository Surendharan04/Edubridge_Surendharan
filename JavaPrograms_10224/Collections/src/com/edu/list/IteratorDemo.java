package com.edu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 5 Elements: ");
		for (int i = 0; i < 5; i++) {
			intArr.add(sc.nextInt());
		}
		
		System.out.println(intArr);
		
		System.out.print("Enter the number you want to remove: ");
		int rem = sc.nextInt();
		//Iterator<Integer> intIter = intArr.iterator();
		
		if(intArr.contains(rem)) {
			intArr.remove(intArr.indexOf(rem));
		}
		
		System.out.println(intArr);
	}
}
