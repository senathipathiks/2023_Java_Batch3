package com.day9;

class A{																					//Parent class
	public A() {
		System.out.println("This is a Super Class Constructor");
	}
	
}

class B extends A{																			//Child class
	public B() {
		System.out.println("This is a Sub Class  Constructor");
	}
}

public class ConstructorChainSample1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B obj = new B();

	}

}
