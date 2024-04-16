package com.code.fibo;

public class FibonacciSeries{

	int num1 = 0;
	int num2 = 1;


	public void printFibo(int limit) {

		logic(limit);
		logic(limit);
		logic(limit);
	}

	private void logic(int limit) {
		while (num2 < limit) {
			System.out.println(num2);

			num2 = num2 + num1;
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibo = new FibonacciSeries();
		fibo.printFibo(200);

	}

}
