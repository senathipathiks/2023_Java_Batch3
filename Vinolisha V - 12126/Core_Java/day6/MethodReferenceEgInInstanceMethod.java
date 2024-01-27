package com.day6;

interface Sayable{
	void say();
}

public class MethodReferenceEgInInstanceMethod {
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	
	public void Something() {
		System.out.println("Hello, this is non-static method");
	}

	public static void main(String[] args) {
		
		//Refering static method
		//Sayable obj=MethodReferenceEgInInstanceMethod::saySomething;
		//Calling interface method
		//sayable.say();
		
		MethodReferenceEgInInstanceMethod methodReference=new MethodReferenceEgInInstanceMethod(); //object creation
		Sayable obj=methodReference::Something;//refering non-static method using reference
		
		obj.say();
		
		//Referring non-static method using anonymous object
		//obj obj2=new MethodReferenceEgInInstanceMethod()::Something; //
		//obj2.say(); //Calling interface method
		
		//Using Lambda Function
		Sayable obj3=()-> System.out.println("Using Lambda Expression...");
		obj3.say();
		
	
		
		

	}

}
