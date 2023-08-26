package com.edu;

class Mobile{
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

class Redmi extends Mobile{
	@Override
	void ringTone() {
		System.out.println("Redmi Ringtone");
	}

	/*void ram() {	//final methods cannot be overriden
		System.out.println("8GB");
	}*/
}

class Car {
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

class MyCar extends Car{
	
}

abstract class Vehicle{		//Abstract classes cannot be used to create objects
	String color;
	
	Vehicle(String color){
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

class Bike extends Vehicle{

	@Override
	void wheels() {
		System.out.println("Two Wheels");
	}
}

class Auto extends Vehicle{	

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
		Bike bikeObj = new Bike();
		
		robj.ringTone();
		robj.theme();
		
		bikeObj.wheels();
		bikeObj.move();
	}
}
