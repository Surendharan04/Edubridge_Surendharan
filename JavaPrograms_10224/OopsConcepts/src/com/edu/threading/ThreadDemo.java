package com.edu.threading;
//One way to create a thread is extending Thread class

class Threads extends Thread{
	//This overrides the inbuilt run
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Child thread "+Thread.currentThread());
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main "+Thread.currentThread());
		Threads th1 = new Threads();
		Threads th2 = new Threads();
		
		th1.start(); //thread can be started only once
		             //if you start more than once it will give an exception
		th1.run();
		th2.start();

	}

}