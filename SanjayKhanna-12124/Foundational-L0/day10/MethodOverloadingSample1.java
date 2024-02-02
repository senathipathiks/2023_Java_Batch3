package com.day10;

public class MethodOverloadingSample1 {											//Method overloading 
	
	void myMethod() {
		System.out.println("This is Method without parameter");
	}
	
	void myMethod(int a){
		System.out.println("This is Method with One Integer parameter");
	}
	
	void myMethod(String a){
		System.out.println("This is Method with One String parameter");
	}
	
	void myMethod(int a,String b){
		System.out.println("This is Method with Two parameters");
	}

	public static void main(String[] args) {
		MethodOverloadingSample1 obj = new MethodOverloadingSample1();
		obj.myMethod();
		obj.myMethod(10);
		obj.myMethod("Sanjay");
		obj.myMethod(10, "Sanjay");
	}

}
