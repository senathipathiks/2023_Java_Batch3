package com.day7;

public class TypeOfMethod {
	
	void myMethod1(){
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		TypeOfMethod obj = new TypeOfMethod();
		obj.myMethod1();//Instance Method Call
		myMethod2();//Static Method call
		
	}

}
