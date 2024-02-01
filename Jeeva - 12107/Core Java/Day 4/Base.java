package com.coreDay4;

public class Base {
	
	void display() {
		System.out.println("Base");
	}

	public static void main(String[] args) {
		
		Base b = new Base();
		b.display();
		
		Base c = new Derived();
		c.display();
		
		Base d = new Derived2();
		d.display();
		
		System.out.println(b instanceof Derived);
		
		

	}

}

class Derived extends Base{
	void display() {
		System.out.println("Derived 1");
	}
}

class Derived2 extends Base{
	void display() {
		System.out.println("Derived 1");
	}
}