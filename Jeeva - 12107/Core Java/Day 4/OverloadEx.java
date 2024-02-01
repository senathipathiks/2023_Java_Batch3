package com.coreDay4;

public class OverloadEx {
	
	public static void area() {
		System.out.println(3.12*7*7);
	}
	public static void area(int side) {
		System.out.println(side * side);
	}
	public static void area(int l, int b) {
		System.out.println(l*b);
	}
	

	public static void main(String[] args) {
		
		area();
		area(4);
		area(4,3);
		

	}

}
