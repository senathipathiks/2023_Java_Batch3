package com.day27;


class Thread3 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
			System.out.println("Thread1 : "+i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
}

class Thread4 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++)
			System.out.println("Thread2 : "+i);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
	}
}


public class MultiThreadingExample2 {

	public static void main(String[] args) {
		
		Thread3 th1 = new Thread3();
		Thread obj1 = new Thread(th1);
		
		Thread4 th2 = new Thread4();
		Thread obj2 = new Thread(th2);
		
		obj2.setPriority(10);
		
		System.out.println("Thread 1 priority : "+obj1.getPriority());
		System.out.println("Thread 2 priority : "+obj2.getPriority());
		
		obj1.start();
		obj2.start();

	}

}
