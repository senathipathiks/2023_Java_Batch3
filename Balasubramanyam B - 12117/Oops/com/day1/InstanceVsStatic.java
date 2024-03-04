package com.day1;

public class InstanceVsStatic {
//      int a=10; //instance or object variable
        static int a=10; // static variables or class variable
	    public static void main(String[] args) {
//		int a ; local variable no default value so we declare the values
//		System.out.println(a);
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println(obj1.a);  //10
		System.out.println(obj2.a);  //10
		
		obj1.a=20;
		
		System.out.println(obj1.a);   //20
		System.out.println(obj2.a);   //10
		
		
	}

}
