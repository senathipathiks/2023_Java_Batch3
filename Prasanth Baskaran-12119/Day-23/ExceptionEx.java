package com.Day5;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			int c = a / b;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(a);

	}

}
