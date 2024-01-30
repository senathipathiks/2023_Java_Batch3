package com.Day8;
class MathCal{
	synchronized void getSumOfArray(int[]numbers) {
		int sum=0;
		for(int number: numbers) {
			System.out.println(Thread.currentThread().getName()+" adds "+sum+" to "+number+" to get -> "+(sum+=number));
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
public class ThreadSumOfArray {
	public static void main(String[] args) {
		MathCal m = new MathCal();
		Thread threadOne = new Thread(()->m.getSumOfArray(new int[] {10,11,12}));
		Thread threadTwo = new Thread(()->m.getSumOfArray(new int[] {20,21,22}));
        threadOne.start();
        threadTwo.start();
	}

}
