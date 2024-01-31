package com.coreday7;

class Calci {

	synchronized void getsumofArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			System.out.println(Thread.currentThread().getName() + " adds " + sum + " to " + number + "to get -> "
					+ (sum += number));
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
	}

}

public class SynchronizedEx2 {
	public static void main(String[] args) {

		Calci obj = new Calci();

		Thread th1 = new Thread(() -> obj.getsumofArray(new int[] { 10, 20, 30 }));

		Thread th2 = new Thread(() -> obj.getsumofArray(new int[] { 40, 50, 60 }));

		th1.start();
		th2.start();

	}

}
