package com.day2.threads;

class MathCal {
	synchronized void getSumOfArray(int[] num) {
		int a = 0;
		for (int i : num) {
			System.out.println(Thread.currentThread().getName()
					+"adds"
					+ a + "to"
					+ num +"to get -> "
					+(a += i));
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class ThreadSyncEx2 {
	
	public static void main(String[] args) {
		MathCal mathSer = new MathCal();
		
		Thread thread1 = new Thread(() ->
		mathSer.getSumOfArray(new int[] {10,11,12}));
		
		Thread thread2 = new Thread(() ->
		mathSer.getSumOfArray(new int[] {10,11,12}));
		
		thread1.start();
		thread2.start();
		
		
	}

}
