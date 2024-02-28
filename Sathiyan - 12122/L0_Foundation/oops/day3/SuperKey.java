package com.oops.day3;


class A3{ // Super class...

	int a=10;
}

class B3 extends A3{ //Sub class...
		
	int a=20;
	
	void display() {
		System.out.println(a);//Variable value should be Overrided
		System.out.println(super.a);//it shows the parent (or) super class Variable Value.
	}
}

public class SuperKey {

	public static void main(String[] args) {

		B3 ref=new B3();
		ref.display();

	}

}
