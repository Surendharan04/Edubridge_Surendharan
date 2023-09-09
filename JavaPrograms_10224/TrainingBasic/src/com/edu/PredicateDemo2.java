package com.edu;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		int[] arr = {4, 12, 89, 4, 6, 14, 78, 23};
		
		Predicate<Integer> predi = (i) -> i > 10;
		Predicate<Integer> prede = (i) -> i % 2 == 0;
		Predicate<Integer> predo = (i) -> i % 2 != 0;
		Predicate<Integer> predno = (i) -> true;
		
		filterNumbersGreaterThanten(predi,arr);
		evenNumbers(prede, arr);
		oddNumbers(predo, arr);
		allNumbers(predno, arr);
	}
	
	private static void evenNumbers(Predicate<Integer> pe, int[] ar) {
		for (int i : ar) {
			if(pe.test(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static void oddNumbers(Predicate<Integer> po, int[] ar) {
		for (int i : ar) {
			if(po.test(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static void filterNumbersGreaterThanten(Predicate<Integer> p, int[] ar) {
		for (int i : ar) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static void allNumbers(Predicate<Integer> pe, int[] ar) {
		for (int i : ar) {
			if(pe.test(i)) {
				System.out.println(i);
			}
		}
	}
}
