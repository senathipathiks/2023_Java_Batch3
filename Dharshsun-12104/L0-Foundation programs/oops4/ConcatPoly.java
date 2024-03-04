package com.oops4;

public class ConcatPoly {
	void concat(int a,int b) {
		System.out.println(a+""+b);
	}
	
	void concat(float a,float b) {
		System.out.println(a+""+b);
	}
	
	void concat(String a,String b) {
		System.out.println(a+b);
	}
	
	void concat(boolean a,boolean b) {
		System.out.println(a+""+b);
	}
public static void main(String args[]) {
	ConcatPoly obj = new ConcatPoly();
	obj.concat(20.00f, 30.00f);
	obj.concat("compile","polymorphism");
	obj.concat(10, 20);
	obj.concat(true, false);
}
}
