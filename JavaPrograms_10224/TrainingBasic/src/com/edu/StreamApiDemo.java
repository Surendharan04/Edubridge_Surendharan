package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//List how many odd numbers are there using stream API
		list.add(42);
		list.add(96);
		list.add(25);
		list.add(16);
		list.add(38);
		list.add(50);
		
		long n = list.stream().filter(i -> i % 2 != 0).count();
		System.out.println("Odd numbers in an array");
		
		List<Integer> li = list.stream().sorted().map(i-> i + 5).collect(Collectors.toList());
		System.out.println(li);
		
		List<String> names = new ArrayList<String>();
		names.add("Revati");
		names.add("Anisha");
		names.add("Ram");
		names.add("Anish");
		names.add("Bharat");
		
		List<String> lst = names.stream().sorted().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println(lst);
	}
}
