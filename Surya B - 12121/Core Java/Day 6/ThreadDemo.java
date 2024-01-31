package com.coreDay6;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		
		t2.start();
		
	
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

}
}

class Thread1 extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Thread - 1");
//			try {
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Thread - 2 ");
//			try {
//				Thread.sleep(500);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
