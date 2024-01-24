package com.day24;

class A{
	public A() {
		System.out.println("This is Class A");
	}
}

class B extends A{
	public B() {
		System.out.println("This is Class B");
	}
	public B(int x) {
		System.out.println("This is Class B("+x+")");
	}
}

class C extends B{
	public C() {
		System.out.println("This is a Class C");
	}
	public C(int x) {
		super(x);
		System.out.println("This is Class C("+x+")");
	}
}

public class ConstructorExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A obj = new C();
	}

}
