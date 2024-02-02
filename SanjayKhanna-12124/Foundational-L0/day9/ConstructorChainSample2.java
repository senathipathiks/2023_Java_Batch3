package com.day9;

class C{																									//Parent class
	public C() {																							//Constructor overloading
		System.out.println("This is a Super Class Default Constructor");
	}
	
	public C(int a) {
		this();
		System.out.println("This is a Super Class Parameterized Constructor : "+a);
	}
}

class D extends C{																							//Child class
	public D() {
		super(10);
		System.out.println("This is a Sub Class  Constructor");
	}
}

public class ConstructorChainSample2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		D obj = new D();

	}

}
