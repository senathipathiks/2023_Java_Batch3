package com.day8;

class MathCalc{
	
	synchronized void getSumOfArray(int[]numbers) {
		int sum=0;
		
	for (int i : numbers) {
		
		System.out.println(Thread.currentThread().getName()+
				" adds "+ sum + " to "+ i + " to get -> "
				+(sum += i));
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			throw new RuntimeException(e);
		}
		
	}
		
		
	}
	
}


public class SyncSumArr {

	public static void main(String[] args) {
		
		MathCalc mathService = new MathCalc();
		
		Thread t1 = new Thread(()->
		mathService.getSumOfArray(new int[] {10,12,22}));
		
		Thread t2 = new Thread(()->
		mathService.getSumOfArray(new int[] {20,22,2}));
		
		t1.start();
		t2.start();
		
		
		
	}

}
