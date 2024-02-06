package com.day21;

class Shape{
	
	void draw() {
		System.out.println("This is Shape Class");
	}
}

class Circle extends Shape{
	
	public Circle() {
		System.out.println("This is Circle Class");
	}
	
	void draw() {
		System.out.println("To Draw a Circle, Radius is required");
	}
	
}

class Rectangle extends Shape{
	
	public Rectangle() {
		System.out.println("This is a Rectangle Class");
	}
	
	void draw() {
		System.out.println("To Draw a Rectangle, Length and Breath are required");
	}
}

class Square extends Shape{
	
	public Square() {
		System.out.println("This is a Square Class");
	}
	
	void draw() {
		System.out.println("To Draw a Square, Length is required");
	}
}

public class MethodOverridingExample2 {

	public static void main(String[] args) {
		Shape circle =  new Circle();
		circle.draw();
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		Shape square = new Square();
		square.draw();

	}

}
