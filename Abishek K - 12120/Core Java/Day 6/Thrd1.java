package com.day6;

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-1");
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
			System.out.println("Thread-2");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thrd1 {

	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		obj.start();
		obj.setPriority(10);
		Thread2 obj2 = new Thread2();
		obj2.start();
		obj2.setPriority(5);
		System.out.println(obj.getPriority());
		System.out.println(obj2.getPriority());
	    

	}

} //Thread life cycle - new, runnable,running,wait,block.
