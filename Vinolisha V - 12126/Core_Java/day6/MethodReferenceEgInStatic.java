package com.day6;

@FunctionalInterface
interface Shape{
	void draw();
}

public class MethodReferenceEgInStatic {
	
	public static void construct() {
	System.out.println("Shape Constructing Process:");
	}

	public static void main(String[] args) {
		Shape obj=MethodReferenceEgInStatic::construct; // referring classname to methodname
		obj.draw();
		

	}

}
