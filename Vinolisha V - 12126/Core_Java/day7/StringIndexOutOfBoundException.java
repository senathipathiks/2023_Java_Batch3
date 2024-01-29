package com.day7;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		String str="Array";
		System.out.println(str.charAt(5));
		int a[]= {1,2,3,4,5};
		int b=10320221;
		try {
			int c=b/a[5];
		}
		catch(ArithmeticException c) {
			System.out.println(c);
		}
	
		
		

	}

}

