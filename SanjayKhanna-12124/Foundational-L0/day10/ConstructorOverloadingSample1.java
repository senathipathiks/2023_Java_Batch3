package com.day10;

public class ConstructorOverloadingSample1 {
	
	public ConstructorOverloadingSample1() {
		this(10);
		System.out.println("This is a Default Constructor");
	}
	
	public ConstructorOverloadingSample1(int a) {
		this("Sanjay");
		System.out.println("This is a Parameterized Constructor with one Integer parameter ");
	}
	public ConstructorOverloadingSample1(String a) {
		this(10,"Sanjay");
		System.out.println("This is a Parameterized Constructor with one String parameter ");
	}
	
	public ConstructorOverloadingSample1(int a,String b) {
		System.out.println("This is a Parameterized Constructor with Two Formal parameter ");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorOverloadingSample1 obj = new ConstructorOverloadingSample1();

	}

}
