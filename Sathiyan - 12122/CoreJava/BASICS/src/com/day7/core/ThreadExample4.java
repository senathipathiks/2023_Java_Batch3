package com.day7.core;

class Thread0001 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1");
		}
	}
}

class Thread0002 implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 2");
		}
	}
}

public class ThreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread0001 th1=new Thread0001();
		Thread0002 th2=new Thread0002();
		Thread obj1=new Thread(th1);
		Thread obj2=new Thread(th2);
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		obj1.start();
		obj2.start();
		
		
	}

}

