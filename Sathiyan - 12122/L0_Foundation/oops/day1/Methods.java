package com.oops.day1;

public class Methods {
	
	void myMethod1() {
		System.out.println("Instance method");
		
	}
	
	static void method2() {
		System.out.println("Static method");
		
	}
	

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		obj.myMethod1();//calling non-static variable
		
		Methods.method2();//calling static variable
		
		

	}

}
