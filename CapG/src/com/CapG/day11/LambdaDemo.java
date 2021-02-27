package com.CapG.day11;

public class LambdaDemo {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(runnable);
		String s = "Hrithik";
		t.start();
		t.setName(s);

	}

}