package com.cqp.sample;

public class FibonacciProgm {

	public void printFib(int n) {
		int a=0,b=1;
		for(int i=0;i<=n;i++) {
			System.out.println(a);
			System.out.println(b);
			
		}
		a=a+b;
		b=a+b;
		
	}
	public static void main(String[] args) {
		FibonacciProgm m = new FibonacciProgm();
		m.printFib(200);
	}
}
