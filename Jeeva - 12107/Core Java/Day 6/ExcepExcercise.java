package com.coreDay6;

public class ExcepExcercise {

	public static void main(String[] args) {
		
	String str = "Array";
	
	int a[] = {1,2,3,4,0};
	int b = 10;
	
	int c;
	
	try {
		c = b/a[3];
	}
	catch (Exception e) {
		System.out.println("Arithmetic Exception" + e);
	}
	finally {
		System.out.println("Executed Successfully");
	}
	
	}
}
