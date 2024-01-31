package com.java8;

interface Gift {
	void buy();
}

public class MethodReference {

	public static void watch() {
		System.out.println("I will buy you watch");
	}
	
	public static void imp(String[]args) {
		Gift obj = MethodReference::watch;
		obj.buy();
	}

}
