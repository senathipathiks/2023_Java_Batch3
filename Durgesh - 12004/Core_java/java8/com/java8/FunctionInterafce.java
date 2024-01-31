package com.java8;

@FunctionalInterface
interface Rectangle {
	int calculate (int x, int y);
	
	String toString();
}

public class FunctionInterafce {

	public static void main(String[] args) {
		int width = 10;
		int length = 5;
		
		Rectangle obj = (l,b)-> l*b;
		System.out.println("Rectangle: "+obj.calculate(width, length));
	}

}
