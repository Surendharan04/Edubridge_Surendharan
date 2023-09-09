package com.edu;

class Mobile1{
	void ringTone() {
		System.out.println("Default Ringtone");
	}
	
	void theme() {
		System.out.println("Default Theme");
	}
	
	final void ram() {
		System.out.println("4GB");
	}
}

class Redmi extends Mobile1{
	@Override
	void ringTone() {
		System.out.println("Redmi Ringtone");
	}

	/*void ram() {	//final methods cannot be overriden
		System.out.println("8GB");
	}*/
}

class Car1 {
	void start() {
		System.out.println("START");
	}
	
	void move() {
		System.out.println("STOP");
	}
	
	void stop() {
		System.out.println("STOP");
	}
}

class MyCar1 extends Car1{
	
}

abstract class Vehicle1{		//Abstract classes cannot be used to create objects
	String color;
	
	Vehicle1(String color){
		System.out.println("Vehicle Constructor");
		this.color = color;
	}
	
	abstract void wheels();	//Abstract method can be used only inside abstract class
	
	void start() {
		System.out.println("START");
	}
	
	void move() {
		System.out.println("STOP");
	}
	
	void stop() {
		System.out.println("STOP");
	}
}

class Bike1 extends Vehicle1{

	Bike1(String color) {
		super(color);
	}

	@Override
	void wheels() {
		System.out.println("Two Wheels");
	}
}

class Auto1 extends Vehicle1{	

	Auto1(String color) {
		super(color);
	}

	@Override
	void wheels() {
		System.out.println("Three Wheels");
	}
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
	}
}

public class OverridingDemo{
	
	public static void main(String[] args) {
		Redmi robj = new Redmi();
		Bike1 bikeObj = new Bike1("Java");
		
		robj.ringTone();
		robj.theme();
		
		bikeObj.wheels();
		bikeObj.move();
	}
}
