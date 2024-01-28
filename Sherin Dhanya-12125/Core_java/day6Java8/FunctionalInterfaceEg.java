package com.day6Java8;
interface Square{
	int calculate(int x);
	String toString();
}
public class FunctionalInterfaceEg {

	public static void main(String[] args) {
int side=4;
Square square=(x)->x*x;
System.out.println("Square : "+square.calculate(side));

	}

}
