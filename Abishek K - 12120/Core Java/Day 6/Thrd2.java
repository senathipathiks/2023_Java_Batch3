package com.day6;

class Threadd1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-1");
		}
		
	}
}
class Threadd2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-2");
		}
		
	}
}

public class Thrd2 {

	public static void main(String[] args) {
		Threadd1 obj1 = new Threadd1();
		Thread objT = new Thread(obj1);
		objT.start();
		Threadd2 obj2 = new Threadd2();
		Thread objT1 = new Thread(obj2);
		objT1.start();

	}

}
