package com.oops.day3;

//Inherit the private variable and Constructor is not possible.

class A4{ // Super class...

	@SuppressWarnings("unused")
	private int a = 10; //It is not possible to inherit bcz as its Visibility.
	public A4(){
		//Inherit Constructor is also not possible because constructor name must be the same as class name.
		//if you could try to inherit the constructor means it gives the char to B also ,so it is not possible.	
	}
}

class B4 extends A4{ //Sub class...
		
	int a=20;
	
	void display() {
		System.out.println(a);//Variable value should be Overrided
//		System.out.println(super.a);//it shows the parent (or) super class Variable Value.
	}
}

public class InheritConstructor {

	public static void main(String[] args) {

		B4 ref=new B4();
		ref.display();

	}

}
