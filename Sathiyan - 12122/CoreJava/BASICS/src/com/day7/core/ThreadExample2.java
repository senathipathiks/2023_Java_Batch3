package com.day7.core;

class Thread01 extends Thread{
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

class Thread02 extends Thread{
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
public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 th1=new Thread01();
//		th1.setPriority(10);
		Thread02 th2=new Thread02();
		th2.setPriority(10);
		th1.start();
		th2.start();
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		
	}

}
