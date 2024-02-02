package com.day11;

interface One {
	int a=10;
}

interface Two {
	int a=20;
}

interface Three extends One,Two{
	void sum();
}

class ConcreteClass implements Three{
	
	public void sum() {
		System.out.println("One's value : "+One.a);
		System.out.println("Two's value : "+Two.a);
		System.out.println("Sum : "+(One.a+Two.a));
	}
	
}
public class InterfaceSample3 {

	public static void main(String[] args) {
		ConcreteClass obj = new ConcreteClass();
		obj.sum();
	}

}
