package com.oops.day4;

public class PolymorphismMethodOverloadingExample2 {

	void addition(int a,int b) {
		System.out.println("Integer additon value of two num is: " +(a+b));
	}
	
	void addition(int a,int b,int c) {
		System.out.println("Integer Additon value is of three number is: " +(a+b+c));
	}
	
	void addition(float a,float b) {
		System.out.println("Floating additon value is: " +(a+b));
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverloadingExample2 ref=new PolymorphismMethodOverloadingExample2();
		ref.addition(10.1f, 26.5f);
		ref.addition(10, 20);
		ref.addition(26, 40, 98 );
		

	}

}
