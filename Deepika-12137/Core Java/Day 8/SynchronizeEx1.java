package com.day8;

class MathCalc{
	synchronized void getSumOfArray(int[] numbers) {
		int sum=0;
		
		for(int number : numbers) {
			System.out.println(Thread.currentThread()
					.getName()
					+ "adds"
					+ sum +"to"
					+ number +"to get ->"
					+ (sum+=number));
			
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
public class SynchronizeEx1 {

	public static void main(String[] args) {
		MathCalc math= new MathCalc();
	
	Thread threadone = new Thread(()->
	                 math.getSumOfArray(new int[] {10,11,12}));
	
	Thread threadTwo = new Thread(()->
    math.getSumOfArray(new int[] {20,21,22}));
	
	threadone.start();
	threadTwo.start();
	
	

	}

}
