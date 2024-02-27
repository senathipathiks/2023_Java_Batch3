package com.oops.day3;

class A1{ // Super class...
	
	A1(){
		System.out.println("Super class Constructor");
	}
	
	A1(int a){
		this();//This will call the default constructor
		System.out.println("Super class Parameterized Constructor");
	}
}

class B1 extends A1{ //Sub class...
		
	//it always calls Default consturctor in superclass
	//to call a parametrized one use super keyword to call paramertized constructor.
	
	B1(){
		super(10);//if we didn't use this, then JVM it will automatically call default construtor.
		System.out.println("Sub class Constructor");
	}
}





public class ConsCreationNew {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B1 ref=new B1();

	}

}
