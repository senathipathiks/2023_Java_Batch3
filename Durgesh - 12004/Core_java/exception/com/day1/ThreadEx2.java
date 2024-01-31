package com.day1;

class Threads1 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1");
		}
	}
}

class Threads2 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2");
		}
	}
}

public class ThreadEx2 {
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2  =new Thread2();
		
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		
		obj1.setPriority(1);
		
		System.out.println(t2.getPriority());
		System.out.println(t1.getPriority());
				
		obj1.start();
		obj2.start();
		
	}

}
