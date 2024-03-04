package com.javacoreday6;

@FunctionalInterface
interface Shape{
	void draw();
}

public class MethodReferenceExample1{
	
	public static void construct() {
		System.out.println("Shape Constructing Process...");
	}

	public static void main(String[] args) {
		Shape obj = MethodReferenceExample1::construct;
		obj.draw();
	}

}
