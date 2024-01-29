package com.javacoreday7;

class Thread12 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-1");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
class Thread22 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-2");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

	
}
class Thread32 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-3");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}


public class RunnableThreads {
	public static void main(String[] args) throws InterruptedException {
		Thread12 th1=new Thread12();
		Thread22 th2=new Thread22();
		Thread32 th3=new Thread32();
//		th2.setPriority(10);
		Thread obj1 = new Thread(th3);
		Thread obj2 = new Thread(th2);
		Thread obj3 = new Thread(th1);
		obj1.setPriority(1);
		obj2.setPriority(5);
		obj3.setPriority(10);
		
//		System.out.println(th2.getPriority());
//		System.out.println(th3.getPriority());
		obj1.start();
		obj2.start();
		obj3.start();
		
	}

}
