package com.oops.day3;

class A{ // Super class...
	
	A(){
		System.out.println("Super class Cnstructor");
	}
}

class B extends A{ //Sub class...
	
	B(){
		System.out.println("Sub class Constructor");
	}
	
}
public class ConstructorCreation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//During object creation B inherit the char of A.
		//Whenever the calling happens for B 1st A will gives the char to B.
		//And then only B can inheirt the char of A
		
		B obj = new B();
 
	}

}
