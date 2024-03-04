package com.oops4;

class SuperClass{
	void myMethod() {
		System.out.println("super class method");
	}
}

class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("Sub class method");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		SubClass sub = new SubClass();
		sub.myMethod();
	}

}
