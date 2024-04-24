package com.cqp.sample;

public class FibonacciProgm {
	int num1=0,num2=1;
	public void printFib(int num) {
		
		loopinglogic(num);
		loopinglogic(num);
		loopinglogic(num);
	}
	private void loopinglogic(int num) {
		while(num1<num) {
			System.out.println(num2);
			num2=num2+num1;
			num1=num2-num1;
		}
	}
	public static void main(String[] args) {
		FibonacciProgm m = new FibonacciProgm();
		m.printFib(200);
	}
}
