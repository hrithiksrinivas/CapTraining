package com.CapG.day_8Threads;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("going to be run by a thread: " + Thread.currentThread().getName());
	}
	
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		// Create a thread object
		Runnable runnable = new MyRunnable();
		Thread t = new Thread(runnable);
		// start the thread
		t.start();
		
		Thread t1 = new Thread(runnable);
		// start the thread
		t1.start();
		
		System.out.println("going to be run by main thread: " + Thread.currentThread().getName() );

	}

}