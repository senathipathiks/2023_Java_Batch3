package com.day10;

class SuperClass{
	
	void myMethod() {
		System.out.println("This is Super Class Method");
	}
}

class SubClass extends SuperClass{
	
	void myMethod() {
		System.out.println("This is Sub Class Method");
	}	
}

public class MethodOverridingSample1 {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.myMethod();
		
		SuperClass obj1 = new SubClass();
		obj1.myMethod();
		

	}

}
