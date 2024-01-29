package com.day71;
class thread1 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread-1");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
		
	}
}

class thread2 extends Thread{
	
	@Override
	public void run() {
		
		//System.out.println("****************************");
		for (int i = 0; i < 100; i++) {
		
			System.out.println("Thread-2");
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
		}
		
	}
}


public class ThreadExcecute{

	public static void main(String[] args) {
		
		thread1 t1 = new thread1();
		
		thread2 t2 = new thread2();
		
		t2.setPriority(10);
		//t1.setPriority(1);
		t1.start();
		t2.start();
		
	//System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		

	}

}
