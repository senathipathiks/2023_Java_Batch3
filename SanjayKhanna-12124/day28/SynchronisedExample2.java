package com.day28;

class MathCalc{
	
	synchronized void getSumOfArray(int[] numbers) {
		int sum =0;
		for(int i : numbers)
			System.out.println(Thread.currentThread().getName()+" adds "+sum+" to "+i+" to get -> "+(sum += i));
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}

public class SynchronisedExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathCalc math = new MathCalc();
		
		Thread th1 = new Thread(()->math.getSumOfArray(new int[] {10,20,30}));
		Thread th2 = new Thread(()->math.getSumOfArray(new int[] {20,40,60}));
		th1.start();
		th2.start();

	}

}
