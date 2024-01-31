package com.coreday7;

class File1 {
	synchronized void print(int num) throws InterruptedException {
		for (int i = num; i>0; i--) {
			System.out.println(i);
			Thread.sleep(1000);

		}
	}
}

class ThreadOne extends Thread {

	File1 f1;

	ThreadOne(File1 f1) {
		this.f1 = f1;
	}

	public void run() {
		try {

			f1.print(10);

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread {

	File1 f2;

	ThreadTwo(File1 f2) {
		this.f2 = f2;
	}

	public void run() {
		try {

			f2.print(20);

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

public class SynchronicedExamples {
	public static void main(String[] args) {

		File1 f1 = new File1();
		ThreadOne th1 = new ThreadOne(f1);
		ThreadTwo th2 = new ThreadTwo(f1);

		th1.start();
		th2.start();

	}

}
