package com.edu.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Float> arf =  new ArrayList<Float>();
		
		arf.add(45.2f);
		arf.add(52.5f);
		arf.add(75.3f);
		arf.add(96.2f);
		
		
		ArrayList<String> ars = new ArrayList<String>();
		
		ars.add("John");
		ars.add("Kevin");
		ars.add("Micheal");
		
		ArrayList<Double> ard = new ArrayList<Double>();
		
		ard.add(125.455);
		ard.add(85.211);
		ard.add(485.624);
		ard.add(365.781);
		
		ArrayList<Integer> ari = new ArrayList<Integer>();
		
		ari.add(58);
		ari.add(75);
		ari.add(25);
		ari.add(50);
		
		System.out.println(ard);
		System.out.println(arf);
		System.out.println(ars);
		System.out.println(ari);
	}

}
