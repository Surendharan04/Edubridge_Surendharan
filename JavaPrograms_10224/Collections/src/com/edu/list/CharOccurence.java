package com.edu.list;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurence {
	
	private static void countChar(String s) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		//System.out.println(hm);
		
		char[] charArr = s.toCharArray();
		
		for (char ch : charArr) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			}
			else {
				hm.put(ch,1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println("Character is " + entry.getKey() + " and count is " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		
		countChar(str);
	}

}
