package com.day6.seminar;

interface Sayable1{
	void say();
}

public class MethodReferenceEx {
	
	public static void construction2() {
		System.out.println("Constructing...");
	}
	
	public void talk() {
		System.out.println("Talking...");
	}

	public static void main(String[] args) {

				//Refers the static Methods
				Sayable1 obj=MethodReferenceEx::construction2;
				obj.say();
				
				//Method Creation for Non-static method reference.
				MethodReferenceEx ref=new MethodReferenceEx();
				
				//Non-static Method reference
				Sayable1 sayable1=ref::talk;
				sayable1.say();
				
				//Using Lambda Expression.
				Sayable1 say=()->System.out.println("Using Lambda Expression : ....");
				say.say();

	}

}
