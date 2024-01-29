package com.day7;


class Thread1 extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello first thread 1");
	}
	
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		super.run();
		
		System.out.println("Hello second Thread 2");
	}
}

 class RunInter implements Runnable{

	@Override
	public void run() {
		
		System.out.println("This is the Runnable interface");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
}

public class MultithereadingEx {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1 ();
		
		Thread2 t2 = new Thread2 ();
		//t2.setPriority(1);
		
		//int a= t2.getPriority();
		//System.out.println(a);
		//t1.setName("Prashanth");
		
		
		t1.start();
		t1.setName("Prashanth");
		
		System.out.println(t1.getName());
		t2.start();
		
		RunInter r = new RunInter();
		
		Thread t = new Thread(r);
		
		t.start();
		//System.out.println(t);
		
		
	}
	


}
