package com.day7;

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread1");
//			try {
//				Thread.sleep(1000);
//				
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
} 

class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Thread2");
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException  {

	Thread1 obj = new Thread1();
	Thread2 obj1 = new Thread2();
	
	obj1.setPriority(1);
	System.out.println(obj1.getPriority());
	
	obj1.start();
	obj.start();
	
	
}
}
