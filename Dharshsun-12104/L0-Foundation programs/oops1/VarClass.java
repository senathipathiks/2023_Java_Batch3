package com.oops1;

public class VarClass {
	int a = 10;
	static int b = 10;
	public static void main(String[] args) {
		int c = 30;
		System.out.println(c);
		
		VarClass obj = new VarClass();
		System.out.println(obj.a);
		
		System.out.println(VarClass.b);
	}

}
