package com.day10;

public class ConstructorOverloadingSample2 {
	
	 ConstructorOverloadingSample2(String a,String b) {
		 this(10f,20f);
		System.out.println("ConstructorOverloadingSample2 with Two String : "+a+" "+b);
	}
	
	 ConstructorOverloadingSample2(int a,int b) {
		 this("Sanjay","Khanna");
		System.out.println("ConstructorOverloadingSample2 with Two Integer : "+a+" "+b);									//Method Overloading
	}
	
	 ConstructorOverloadingSample2(float a,float b) {
		System.out.println("ConstructorOverloadingSample2 with Two Float : "+a+" "+b);
	}
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorOverloadingSample2 obj = new ConstructorOverloadingSample2(10,20);
	}

}
