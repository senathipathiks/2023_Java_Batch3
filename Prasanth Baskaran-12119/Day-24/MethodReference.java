package com.Day6;


interface Shape{
	
	void draw();
}

public class MethodReference implements Shape{
	
	public void draw() {
		
		System.out.println("draw method");
	}
	
	public static void construct() {
		System.out.println("Shape using construct method calling...");
		
	}

	public static void main(String[] args) {
		
		
		Shape s = MethodReference::construct;
		Shape s1 = new MethodReference();
		
		s.draw();
		s1.draw();

	}

}
