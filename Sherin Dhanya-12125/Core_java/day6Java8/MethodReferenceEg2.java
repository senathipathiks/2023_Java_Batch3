package com.day6Java8;
interface Sayable{
	void say();
}
public class MethodReferenceEg2 {
public static void saysomething() {
	System.out.println("Hello, this is static method");
}
public void something() {
	System.out.println("Hello, this is non static method");
}
public static void main(String[] agrs) {
	//Referring no static method using reference
	MethodReferenceEg2 methodreference=new MethodReferenceEg2();	//creating object
	Sayable sayable1 = methodreference::something;	
	sayable1.say();
	
	//referring non static method using anonymous object
	Sayable sayable2= new MethodReferenceEg2()::something;
	sayable2.say();
	
	//using lambda expression
	Sayable sayable=()->System.out.println("Using lambda expression");
	sayable.say();
}
}
