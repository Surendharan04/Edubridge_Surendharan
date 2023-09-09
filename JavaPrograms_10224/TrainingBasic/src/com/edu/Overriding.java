package com.edu;

class Mobile {
	void ringTone() {
		System.out.println("Default RingTone");
	}
	
	void theme() {
		System.out.println("Default Theme");
	}
	//final method cannot be overriden
	final void ram() {
		System.out.println("4GB RAM");
	}
}

class MyMobile extends Mobile{
	@Override
	void ringTone() {
		System.out.println("My RingTone");
	} 
	
//	@Override
//	void ram() {
//		System.out.println("8GB RAM");
//	}
}
class Car{
	
	void start() {
		System.out.println("START");
	}
	
	void move() {
		System.out.println("MOVE");
	}
	
	void stop() {
		System.out.println("STOP");
	}
}

class MyCar extends Car{
	
	
	
}

abstract class Vehicle {
	String colour;
	Vehicle(String colour) {
		System.out.println("Vehicle Constructor");
		this.colour = colour;
	}
	
	Vehicle() {
		System.out.println("ZERO AURG CONSTURUCTOR");
	}
	
	abstract void wheels();
	
	void start() {
		System.out.println("START");
	}
void move() {
		System.out.println("MOVE");
	}
	
	void stop() {
		System.out.println("STOP");
	}
	
}

class Bike extends Vehicle{

	Bike(String colour) {
		super(colour);
		
	}

	@Override
	void wheels() {
		System.out.println("TWO WHEELS");
		
	}
	
}

class Auto extends Vehicle{

	@Override
	void wheels() {
		System.out.println("THREE WHEELS");
		
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		
//		MyMobile mob = new MyMobile();
//		mob.ringTone();
//		mob.theme();
//		mob.ram();
//		Mobile m1 = new Mobile();
//		m1.ram();
		Bike bike = new Bike("red");
		bike.start();
		

	}

}
