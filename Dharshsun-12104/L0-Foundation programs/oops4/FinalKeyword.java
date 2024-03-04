package com.oops4;
// USING PRIVATE CONSTRUCTOR INHERITANCE CAN BE STOPPED.

class Vehicle3{
	final void m() {
		System.out.println("A");
	}
}

class TwoWheeler3 extends Vehicle3{
	void myMethod() {
		System.out.println("B");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		final int a = 10;
		System.out.println(a);
		
	}
}
