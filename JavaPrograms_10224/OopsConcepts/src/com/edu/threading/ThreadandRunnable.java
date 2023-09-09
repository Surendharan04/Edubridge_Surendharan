package com.edu.threading;

class Demo extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("ThreadInfo:- " + Thread.currentThread());
		}
	}
	
}

class RunDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable");
	}
	
}

public class ThreadandRunnable {

	public static void main(String[] args) throws InterruptedException {
		Demo th1 = new Demo();
		Demo th2 = new Demo();
		RunDemo runnable = new RunDemo();
		
		th1.setName("Thread-1 ");
		th1.start();
		
		th2.setName("Thread-2 ");
		th2.setPriority(10);
		th2.start();
		th2.join();
		
		System.out.println(Thread.currentThread());
		//Thread.sleep(1000);

		

		System.out.println(Thread.currentThread());
		
		//th1.run();
		//runnable.run();
	}

}
