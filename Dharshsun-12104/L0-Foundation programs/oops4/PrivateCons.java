package com.oops4;

//inheritance does not occur as private constructor is used.

class A{
	private A() {}// inheritance does not occur as private constructor is used.
}
	class B extends A{
		B(){}
	}
public class PrivateCons {
	public static void main(String[] args) {
		B obj = new B();
	}
}



