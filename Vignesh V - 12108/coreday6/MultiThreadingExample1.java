package com.coreday6;

class Thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1");
//			try {
//			Thread.sleep(1000);
//
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//				// TODO: handle exception
//			}

		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-2");

//			try {
//				//Thread.sleep(2000);
//
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//				// TODO: handle exception
//			}

		}
	}
}

public class MultiThreadingExample1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		// th1.setPriority(1);
		Thread obj1 = new Thread(th1);
		Thread obj2 = new Thread(th2);

		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		obj1.start();

		obj2.start();

	}

}
