package com.coreDay7;

public class SychronizedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathCalc math = new MathCalc();
		
		Thread thone = new Thread(() -> 
				math.getSumofArray(new int[] {10,11,12}));
		
		Thread thtwo = new Thread(() -> 
		math.getSumofArray(new int[] {10,11,12}));
		
		thone.start();
		thtwo.start();
	}

}

class MathCalc 
{
	synchronized void getSumofArray(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			System.out.println(Thread.currentThread().getName() + " adds " + sum + " to " + number + " to get --> " 
				+ (sum += number));
				
				try {
					Thread.sleep(500);
					
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
		}
	}
}
