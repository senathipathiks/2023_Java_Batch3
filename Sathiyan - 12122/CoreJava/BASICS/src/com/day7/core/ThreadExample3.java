package com.day7.core;

class Thread001 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
		}
	}
}

class Thread002 extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 2");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread001 th1=new Thread001();
		Thread002 th2=new Thread002();
		Thread obj1=new Thread(th1);
		Thread obj2=new Thread(th2);
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		obj1.start();
		obj2.start();
		
		
	}

}
