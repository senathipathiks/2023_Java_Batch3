package com.oops.day4;

class Superclass{
	void myMethod() {
		System.out.println("Am a Superclass");
	}
	
}

class SubClass extends Superclass{
	void myMethod() {
		System.out.println("Am a Sub-class");
	}
}

public class OverridingSample {

	public static void main(String[] args) {
		SubClass ref=new SubClass();//Call the subclass method.
		ref.myMethod();
		Superclass ref2=new Superclass();//Call the superclass method.
		ref2.myMethod();

	}

}
