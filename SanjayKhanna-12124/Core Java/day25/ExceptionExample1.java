package com.day25;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			System.out.println("Output" + a/b);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Values are : "+a+", "+b);
	}

}
