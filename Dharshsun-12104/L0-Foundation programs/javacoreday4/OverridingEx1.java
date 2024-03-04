package com.javacoreday4;

class Base{
	 void display() {
		// TODO Auto-generated method stub
		 System.out.println("Base");
	}
}
class Derived1 extends Base{
	void display() {
		System.out.println("derived1");
	}
}
class Derived2 extends Base{
	void display() {
		System.out.println("derived2");
	}
}
public class OverridingEx1 {
	public static void main(String[] args) {
		Base obj=new Base();
		obj.display();
		
		Base obj1=new Derived1(); // upcasting parent to child.
		obj1.display();
		
		Base obj2=new Derived2();
		obj2.display();
		
		Derived2 obj3 = (Derived2) obj1;
		obj3.display();
		System.out.println(obj2 instanceof Base);
		
		
	}

	

}
