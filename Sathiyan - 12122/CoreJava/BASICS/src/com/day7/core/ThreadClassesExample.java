package com.day7.core;

import java.util.Iterator;

class Thread1 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1");
			}
		}
	}

class Thread2 extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 2");
		}
	}
}
public class ThreadClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		th1.start();
		th2.start();
	}

}
