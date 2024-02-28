package com.oops.day1;

public class ConstructorClass {

	public ConstructorClass() {
		this(5);
		System.out.println("A");
	}
	
	public ConstructorClass(int a) {
		this("Sathya");
		System.out.println("B");
	}
	
	public ConstructorClass(String b) {
		System.out.println("C");
	}
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass con=new ConstructorClass();
	}
}
