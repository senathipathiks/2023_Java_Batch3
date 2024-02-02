package com.day10;

public class MethodOverloadingSample3 {
	
	void concat(String a,String b) {
		System.out.println("Concatenation of Two String : "+a+b);
	}
	
	void concat(int a,int b) {
		System.out.println("Concatenation of Two Integer : "+a+b);									//Method Overloading
	}
	
	void concat(float a,float b) {
		System.out.println("Concatenation of Two Float : "+a+b);
	}

	public static void main(String[] args) {
		MethodOverloadingSample3 obj = new MethodOverloadingSample3();								//Object creation
		obj.concat("Sanjay", "Khanna");
		obj.concat(10, 20);
		obj.concat(20f, 10f);

	}

}
