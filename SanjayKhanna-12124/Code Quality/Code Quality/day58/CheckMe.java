package com.day58;

public class CheckMe {
	
	private int first = 0;
	private int second = 1;

	//Method to Printing fibonacci series
	public void printFibo(int limit) {
		
		
		System.out.print("Fibonacci series : ");
		
		loopingLogic(limit);
		loopingLogic(limit);
		loopingLogic(limit);
		loopingLogic(limit);
	}

	private void loopingLogic(int limit) {
		while (first <= limit) {
			System.out.print(first + " ");
			first = first + second;
			second = first - second;
		}
	}
	
	//main method
	public static void main(String[] args) {
		CheckMe m = new CheckMe();
		m.printFibo(200);
	}

}
