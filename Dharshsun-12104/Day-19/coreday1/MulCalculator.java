package com.coreday1;

public class MulCalculator {
	public int multiply(int a,int b) {
		return a * b;
	}
	public float multiply(float a,float b) {
		return a * b;
	}
	public float multiply(float a,int b) {
		return a * b;
	}
	public float multiply(int a,float b) {
		return a * b;
	}
	public static void main(String args[]) {
		MulCalculator calc = new MulCalculator();
		System.out.println(calc.multiply(3, 4));
		System.out.println(calc.multiply(5.4f, 3.8f));
		System.out.println(calc.multiply(3, 8.4f));
		System.out.println(calc.multiply(3.7f, 9));
	}

}
