package com.oops.day4;

/*
 * Polymorphism
 * 1.Overloading / Compile-time polymorphism.
 * 		>>> Method overloading
 * 		>>> Constructor overloading
 * (By using Overloading we are not removing anything just adding the funtionality in them based on the requirement)
 * 
 * 2.Overriding / Run-time polymorphism.
 * 		>>> Method Overriding.
 */


//Method Overloading.

public class PolyMorphismMethodOverloading {
	
	void myMethod() {//method 1
		System.out.println("Welcome all");
	}
	
	void myMethod(int a) {//method 2
		System.out.println("You're Entered : " + a);
	}

	void myMethod(String name) {//method 3
		System.out.println("Welcome : "+name);
		
	}
	
	void myMethod(int b, int c) {//method 4
		System.out.println("You're Entered number 1 as "+b+" and number 2 as "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorphismMethodOverloading ref=new PolyMorphismMethodOverloading();
		ref.myMethod();
		ref.myMethod(10);
		ref.myMethod("Sathya");
		ref.myMethod(50, 100);

	}

}
