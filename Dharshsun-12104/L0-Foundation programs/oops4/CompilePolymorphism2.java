package com.oops4;

public class CompilePolymorphism2 {
	
	void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	void addition(float a,float b) {
		System.out.println(a+b);
	}
public static void main(String args[]) {
	CompilePolymorphism2 obj = new CompilePolymorphism2();
	obj.addition(20.00f, 30.00f);
	obj.addition(10, 20, 30);
	obj.addition(10, 20);
}
}
