package com.Day4Oops;
class Base{
	void display() {
		System.out.println("Base class");
	}
}
class Derived1 extends Base{
	void display() {
		System.out.println("Derived 1 class");
	}
}
class Derived2 extends Base{
	void display() {
		System.out.println("Derived 2 class");
	}
}
public class OverRidding {

	public static void main(String[] args) {
		Base b = new Base();
		b.display();
		Base d1 = new Derived1();
		d1.display();
		Derived2 d2 = new Derived2();
		d2.display();
		

	}

}
