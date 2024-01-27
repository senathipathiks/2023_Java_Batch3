package com.day6;
interface Square{
	int calculate(int x);
	
	String toString();
}
public class FunctionalInterface {
	public static void main(String[] args) {
		int side=15;
		
		Square sqr=(x)->x*x;
		System.out.println("Square :"+sqr.calculate(side));
		
	}

}
