package com.oops.day3;


class A2{ // Super class...
	
	A2(){
		System.out.println("Super class Constructor");
	}
	
	A2(int a){
//		this(); This will call the default constructor
		System.out.println("Super class Parameterized Constructor");
	}
}

class B2 extends A1{ //Sub class...
		
	//it always calls Default consturctor in superclass
	//to call a parametrized one use super keyword to call paramertized constructor.
	
	B2(){
//		super(10); if we didn't use this, then JVM it will automatically call default construtor.
		System.out.println("Sub class Constructor");
	}
	
	B2(int a){
		System.out.println("Sub class Parametrized Constructor");
	}
	
}

public class ConCreNew2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		B2 ref=new B2(10);

	}

}
