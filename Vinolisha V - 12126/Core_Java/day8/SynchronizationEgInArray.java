package com.day8;

class MathCalc{
	 synchronized void getSumOfArray(int[]  numbers) {
		int sum=0;
		
		for(int number : numbers) {
			System.out.println(Thread.currentThread().getName()
					+ "adds"
					+ sum+ "to" 
					+sum + "to"
					+number + "to get ->"
					+(sum+=number));
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
		}
		
	}
}

public class SynchronizationEgInArray {

	public static void main(String[] args) {
		MathCalc mathService = new MathCalc();
		
		Thread threadOne = new Thread(() ->
			mathService.getSumOfArray(new int[] {10,11,12}));
		Thread threadTwo = new Thread(() ->
				mathService.getSumOfArray(new int[] {20,21,23}));
		
		threadOne.start();
		threadTwo.start();
	}

}
