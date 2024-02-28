package com.day4.core;

public class Overloading {

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
	    area();
	    area(2);
	    area(4,8);
	}

}
