package com.Day4;

class Derived{
	
	void display() {
		System.out.println("Derived1 class");
	}
	
}

class Derived2 extends Derived{
	
	@Override
	void display() {
		System.out.println("Derived2 class");
	}
	
	
	
}

class Derived3 extends Derived2{
	@Override
	void display() {
		System.out.println("Derived3 class");
	}
	
	
	
	
}

public class OverrideingEx {

	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.display();
		System.out.println("*******************************************");
		
		Derived d1 = new Derived2();
		
		d1.display();
		
		System.out.println("*******************************************");
		
		Derived d2 = new Derived3();
		
		System.out.println(d2 instanceof Derived3); //  true
		
		
		
		
		
		d2.display();
		
        Derived2 d3 = (Derived2)d1; //down cast
		
		d3.display();
		
	}

}
