package com.day4;

class OverloadingEx{
	public static void area() {
		System.out.println(3.14*7*7);
	}
	public static void area(int side) {
		System.out.println(side*side);
	}
	public static void area(int l,int b) {
		System.out.println(l*b);
	}
}

public class Poly1 {

	public static void main(String[] args) {
	OverloadingEx obj = new OverloadingEx();
	OverloadingEx.area();
	OverloadingEx.area(5);
	OverloadingEx.area(5, 6);

	}

}
