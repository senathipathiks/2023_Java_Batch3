package com.Day4Oops;

public class OverLoading {
	public static void area() {
		System.out.println(3.14*7*7);
	}
	public static void area(int side) {
		System.out.println(side*side);
	}
	public static void area(int l,int b) {
		System.out.println(l*b);
	}
	
	public static void main(String[] args) {
		OverLoading.area();
		area(5);
		area(4,4);

	}

}
