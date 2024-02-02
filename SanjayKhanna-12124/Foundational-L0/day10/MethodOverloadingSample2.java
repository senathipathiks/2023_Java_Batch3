package com.day10;

public class MethodOverloadingSample2 {
	
	void multiply(int a,int b) {
		System.out.println("Product of Two Integer : "+a*b);
	}
	void multiply(int a,int b,int c) {
		System.out.println("Product of Three Integer : "+a*b*c);										//Method Overloading
	}
	void multiply(float a,float b) {
		System.out.println("Product of Two float : "+a*b);
	}
	void multiply(float a,int b) {
		System.out.println("Product of Integer and float : "+a*b);
	}

	public static void main(String[] args) {
		MethodOverloadingSample2 obj = new MethodOverloadingSample2();
		obj.multiply(2,3);
		obj.multiply(2,3,4);
		obj.multiply(2, 3);
		obj.multiply(10.00f, 2);

	}

}
