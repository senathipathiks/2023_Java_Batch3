package com.day9;

class E{
	public E() {
		System.out.println("This is a Super Class Default Constructor ");
	}
																											//Super Class Constructor Overloading
	public E(int a) {
		System.out.println("This is a Super Class Parameterized Constructor : "+a);
	}
}

class F extends E{
	
	public F() {
		System.out.println("This is a Sub Class Default Constructor ");
	}
																											//Sub Class Constructor Overloading
	public F(int a) {
		super(40);																							//Using super()
		System.out.println("This is a Sub Class Parameterized Constructor : "+a);
	}
}

public class ConstructorChainSample3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		F obj = new F(30);

	}

}
