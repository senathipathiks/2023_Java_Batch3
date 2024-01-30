package com.Day_8;

class MathCalc{
	synchronized void getSumOfArray(int[] numbers) {
		int sum=0;
		
		for (int number : numbers) {
			System.out.println(Thread.currentThread()
					.getName()
					+" adds "
					+sum+" to "
					+number +" to get -> "
					+(sum+=number));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
	}
}

public class SynchronizedExample2 {

	public static void main(String[] args) {
		
		MathCalc mathService = new MathCalc();
		
		Thread threadOne=new Thread(() ->
				mathService.getSumOfArray(new int[] {10,11,12}));
		
		Thread threadTwo=new Thread(() ->
				mathService.getSumOfArray(new int[] {13,14,15}));
		
		threadOne.start();
		threadTwo.start();
	}

}
