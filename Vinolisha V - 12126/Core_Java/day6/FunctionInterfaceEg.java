package com.day6;
//function interface has only one abstract method
@FunctionalInterface

interface Square{
	int calculate(int x);
	
	String toString();
}

public class FunctionInterfaceEg {

	public static void main(String[] args) {
		int side=15;
		
		Square square=(x)->x*x;
		System.out.println("Square:" + square.calculate(side));
	}

}
