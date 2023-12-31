package com.edu.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapDemo {	//Map is independent from Collection and it has key value pairs

	public static void main(String[] args) {
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();		//It will not maintain the order
		//LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();		//It will maintain the order
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();		//It will sort the list
		
		//Hashmap will not take duplicates keys but can take same values for different keys
		
		hm.put(3, "John");
		hm.put(2, "Will");
		hm.put(1, "Sam");
		hm.put(5, "John");
		hm.put(4, "Chris");
		hm.put(1, "John");
		
		System.out.println(hm);
		
		boolean gotValue = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to be searched: ");
		String name = sc.next();
		
		
		//Iterator will not work without Entry interface as Map is independent from collections
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " and Value is " + entry.getValue());
			if (entry.getValue() == name && gotValue == false) {
				gotValue = true;
				System.out.println("The name exists");
			}
			else {
				System.out.println("The name does not exist");
			}
		}
		
		
	}

}
