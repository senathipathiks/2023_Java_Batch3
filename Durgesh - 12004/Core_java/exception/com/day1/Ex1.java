package com.day1;

public class Ex1 {

	public static void main(String[] args) {
		int a  = 10;
		int b = 0;
		int c;
		
		try {
			c = a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		try {
//			c = a/b;
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
//		try {
//			c = a/b;
//		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
