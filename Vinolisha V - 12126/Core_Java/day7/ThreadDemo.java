package com.day7;

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=1");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=2");
		try {
			Thread2.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}
}

class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=3");
	}
}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread1 th1=new Thread1();
		th1.start();
		Thread2 th2=new Thread2();
		th2.start();
		Thread3 th3=new Thread3();
		th3.start();
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());

	}

}




