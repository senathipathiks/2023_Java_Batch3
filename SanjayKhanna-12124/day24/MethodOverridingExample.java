package com.day24;

class Base{
	void display() {
		System.out.println("This is Base Class");
	}
}

class Derived1 extends Base{
	void display() {
		System.out.println("This is Derived1 Class");
	}
}

class Derived2 extends Base{
	void display() {
		System.out.println("This is Derived2 Class");
	}	
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Base obj1 = new Base();
		obj1.display();
		System.out.println(obj1 instanceof Base);
		
		Base obj2 = new Derived1();//UpCasting
		obj2.display();
		System.out.println(obj2 instanceof Base);
		
		Base obj3 = new Derived2();//UpCasting
		obj3.display();
		System.out.println(obj3 instanceof Base);
		
//		Derived2 obj4 = (Derived2)obj1; //DownCasting
//		obj4.display();
//		
//		Derived2 obj5 = (Derived2) new Base();
//		obj5.display();

	}

}