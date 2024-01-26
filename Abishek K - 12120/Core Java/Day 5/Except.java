package com.day5;

public class Except {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			int c= a/b;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a);

	}

}
