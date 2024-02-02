package com.day7;

//Instance vs Static

public class InstanceVsStatic {
	int a=10;//Instance variable
	static int b=50;

	public static void main(String[] args) {
		InstanceVsStatic obj1 =new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println("Instance Variable example");
		System.out.println("Object 1 : "+obj1.a);
		System.out.println("Object 2 : "+obj2.a);
		System.out.println("After Changing");
		obj1.a=20;
		System.out.println("Object 1 : "+obj1.a);
		System.out.println("Object 2 : "+obj2.a);
		System.out.println("Static Variable example");
		System.out.println("Object 1 : "+InstanceVsStatic.b);
		System.out.println("Object 2 : "+InstanceVsStatic.b);
		System.out.println("After Changing");
		InstanceVsStatic.b=20;
		System.out.println("Object 1 : "+InstanceVsStatic.b);
		System.out.println("Object 2 : "+InstanceVsStatic.b);
	}

}
