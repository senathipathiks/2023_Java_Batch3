package com.day7;

class Thread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Thread 1");
		}
	}
	
}

class Thread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Thread 2");
		}
	}
	
}
public class ThreadDemo2{
	public static void main(String[] args) {
		Thread3 th1 = new Thread3();
		Thread4 th2 = new Thread4();
		
		Thread obj1 = new Thread(th1);
		Thread obj2 = new Thread(th2);
		
		obj2.setPriority(10);
		
		System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        
        obj2.start();
        obj1.start();
        
		
	}
	
}
