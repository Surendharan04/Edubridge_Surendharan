package com.edu;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> pred = (i) -> (i)>10;
		int no = 19;
		boolean b = pred.test(no);
		
		
		System.out.println(b);
	}
}
