package com.Day7;
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-1 "+i);
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
			System.out.println("Thread-2 "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}}
class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-3 "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
	    Thread3 t3 = new Thread3();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		t3.start();
		Thread t5 = new Thread(t1);
		Thread t4 = new Thread(t2);
		t5.setPriority(10);
		System.out.println(t5.getPriority());
		System.out.println(t4.getPriority());
		 
	}

}
