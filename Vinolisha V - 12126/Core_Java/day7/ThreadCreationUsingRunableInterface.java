package com.day7;

class Threads1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=1");
		
	}
	
}
}

class Threads2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=2");
		
	
	}
}
}

class Threads3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread=3");
	}
}
}


public class ThreadCreationUsingRunableInterface {

	public static void main(String[] args) {
		Threads1 ths1=new Threads1();
		
		Threads2 ths2=new Threads2();
		
		Threads3 ths3=new Threads3();
		
		Thread obj=new Thread(ths1);
		Thread obj1=new Thread(ths2);
		Thread obj2=new Thread(ths3);
		
		obj.setPriority(10);
	
		
		
		System.out.println(obj.getPriority());
		System.out.println(obj1.getPriority());
		
		obj.start();
		obj1.start();
		

	}

}
