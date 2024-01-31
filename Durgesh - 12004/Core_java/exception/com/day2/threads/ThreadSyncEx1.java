package com.day2.threads;

class File1 {
	synchronized void print(int num) throws InterruptedException{
		for (int i = num; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}

class ThreadOne extends Thread {
	File1 f2;
	ThreadOne (File1 f2){
		this.f2 = f2;
	}
	
	public void run() {
		try {
			f2.print(40);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadSyncEx1 {

	public static void main(String[] args) {
		File1 f1 = new File1();
		ThreadOne t1 = new ThreadOne(f1);
		ThreadOne t2 = new ThreadOne(f1);
		
		t1.start();
		t2.start();
	}

}
