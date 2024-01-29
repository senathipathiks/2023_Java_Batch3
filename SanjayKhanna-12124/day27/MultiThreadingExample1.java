package com.day27;

class Thread1 extends Thread{
	
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

class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
			System.out.println("Thread2 : "+i);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
	}
}



public class MultiThreadingExample1 {

	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		th1.setPriority(10);
		System.out.println("Thread 1 priority : "+th1.getPriority());
		System.out.println("Thread 2 priority : "+th2.getPriority());
		
		
		

	}

}
