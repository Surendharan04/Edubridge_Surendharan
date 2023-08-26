package com.edu;

abstract class Shape{
	abstract void area();
	void display() {
		System.out.println("Non abstract method");
	}
}

class Triangle extends Shape{
	@Override
	void area() {
		System.out.println("Area of Triangle");
	}
}

public class Abstract {
	public static void main(String[] args) {
		//Shape shapeObj = new Shape();	//Abstract class cannot be instantiated
		
		Triangle triObj = new Triangle();
		triObj.area();
		triObj.display();
	}
}
