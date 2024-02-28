package com.oops.day1;

public class LocalVariable {

	static int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(LocalVariable.a);
		
		int b;
		
//		System.out.println(b); (It is not possible to use local variable withpout initializing it)
		
		b=20;//Initializing the value to the variable b.
		System.out.println(b);


	}

}
