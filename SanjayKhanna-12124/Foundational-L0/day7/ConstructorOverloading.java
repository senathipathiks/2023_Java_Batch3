package com.day7;


public class ConstructorOverloading {
	public ConstructorOverloading() {
		this(10);
		System.out.println("This is default constructor..");
	}
	

	public ConstructorOverloading(int i) {

		System.out.println("This is a Parameterized constructor.. argument : "+i);
	}
	
	


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(19);
		
	}

}
