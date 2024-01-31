package com.day1;

class Thread1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1");
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
}


public class ThreadEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1 = new Thread1();
		Thread2 t2  =new Thread2();
		
		t1.start();
		t2.start();
		
		System.out.println(t2.getPriority());
		System.out.println(t1.getPriority());

	}

}
