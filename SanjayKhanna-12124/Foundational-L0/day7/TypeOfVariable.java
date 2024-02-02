package com.day7;

//Three types of variables in java

public class TypeOfVariable {
	int a=20; //Instance or Object variable
	
	static int b=30; //Static variable or class variable 
	
	public static void main(String[] args) {
		int c =10; 
		System.out.println("Local Variable 'c' : "+c);
		
		TypeOfVariable new1 = new TypeOfVariable();
		System.out.println("Instance varible 'a' : "+new1.a);

		System.out.println("Static variable 'b' : "+b);
	}

}
