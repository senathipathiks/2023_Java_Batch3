package com.day1;

public class InstanceAndStaticMethod {
    void myMethod1() {
    	System.out.println("Instance method");
    }
   static void myMethod2() {
    	System.out.println("Static method");
    }
	public static void main(String[] args) {
		InstanceAndStaticMethod method = new InstanceAndStaticMethod();
		method.myMethod1();
		InstanceAndStaticMethod.myMethod2();
		

	}

}
