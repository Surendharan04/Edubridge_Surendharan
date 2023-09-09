package com.edu;

interface Printer{
	void print();
	default void scan() {
		System.out.println("Scanning...");
	}
}

public class Interfacing {

	public static void main(String[] args) {
		
	}
}
