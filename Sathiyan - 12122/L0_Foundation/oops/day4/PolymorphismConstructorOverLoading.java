package com.oops.day4;

public class PolymorphismConstructorOverLoading {

	PolymorphismConstructorOverLoading() {//Constructor 1
		
		System.out.println("Welcome all");
	}
	
	PolymorphismConstructorOverLoading(int a) {//Constructor 2
		this("Sathya");
		System.out.println("You're Entered : " + a);
	}

	PolymorphismConstructorOverLoading(String name) {//Constructor 3
		this();
		System.out.println("Welcome : "+name);
		
	}
	
	PolymorphismConstructorOverLoading(int b, int c) {//Constructor 4
		this(5);
		System.out.println("You're Entered number 1 as "+b+" and number 2 as "+c);
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PolymorphismConstructorOverLoading ref4=new PolymorphismConstructorOverLoading(5,10);
	}

}
