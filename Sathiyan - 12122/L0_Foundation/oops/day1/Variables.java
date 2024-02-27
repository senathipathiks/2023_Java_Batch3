package com.oops.day1;

public class Variables {
	int a=10;//Instance variable or Object Variable
	static int b=20;//Static variable or class variable

	public static void main(String[] args) {
		int c=30;//Local variable
		
		Variables var=new Variables();
		System.out.println(var.a);
		
		System.out.println(Variables.b);
		
		System.out.println(c);
	}

}
