package com.fibonacciseries;

public class FibonacciSeriesGenerator {
	int firstValue = 0;
	int secondValue = 1;

	public void printFiboSeries(int limit) {

		
//		System.out.println(firstValue);

		//loop for the first time
		fibono(limit);
		//loop for the second time
		fibono(limit);
		//loop for the third time
		fibono(limit);

	}

	void fibono(int limit) {
		while (firstValue+secondValue < limit) {

//			System.out.println(firstValue + secondValue);

			secondValue = firstValue + secondValue;

			firstValue = secondValue - firstValue;

		}
	}

	public static void main(String[] args) {

		FibonacciSeriesGenerator seriesGenerator = new FibonacciSeriesGenerator();
		seriesGenerator.printFiboSeries(200);
	}

}
