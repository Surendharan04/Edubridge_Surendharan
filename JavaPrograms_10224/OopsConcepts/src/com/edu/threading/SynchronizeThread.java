package com.edu.threading;

class Multitable{
	synchronized void table(int no){
		for (int i = 1; i <= 10; i++) {
			System.out.println(no + "x" + i + "=" + no * i);
		}
	}
}

class Thread1 extends Thread{
	Multitable t1;
	
	public Thread1(Multitable table) {
		this.t1 = table;
	}

	@Override
	public void run() {
		t1.table(2);
	}
	
}

class Thread2 extends Thread{
	Multitable t2;
	
	public Thread2(Multitable table) {
		this.t2 = table;
	}

	@Override
	public void run() {
		t2.table(5);
	}
}

public class SynchronizeThread {
	public static void main(String[] args) throws InterruptedException {
		Multitable table = new Multitable();
		Thread1 th1 = new Thread1(table);
		Thread2 th2 = new Thread2(table);
		
		th1.start();
		th2.start();
		th2.join();
		
	}
}
