package com.edu;

interface Hello{
	void message();
}

public class StreamDemo3 {
	public static void hi(){
		System.out.println("The Hello interface method is called");
	}
	
	public static void run() {
		System.out.println("run Method is called");
	}
	
	public static void main(String[] args) {
		Hello hl = StreamDemo3::hi;
		hl.message();
		
		Thread thObj = Hello :: run;
		thObj.start();
	}
}
