package com.day26.java8;

@FunctionalInterface
interface Square {
    int calculate(int x);
    
    String toString();
}
 

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int side = 15;
		
		Square square = (x) -> x*x;
		System.out.println("Square : "+square.calculate(side));
	}

}
