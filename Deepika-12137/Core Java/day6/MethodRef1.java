package com.day6;
interface Sayable{
	void say();
}
public class MethodRef1 {

	public static void saySomething() {
		System.out.println("Static Method");
	}
	public void Something() {
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) {
		MethodRef1 ref =new MethodRef1();
		Sayable sayable = ref::Something;
		sayable.say();

		Sayable sayable1 = ()-> System.out.println("lambda expression");
		sayable1.say();
		
	}
}
