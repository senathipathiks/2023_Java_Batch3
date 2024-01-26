package com.newclass;


class Circle extends Shape{
	
	void draw() {
		System.out.println("This is cirle drawing!!!");
	}
}

class Rectangle extends Circle{
	
	void draw() {
		System.out.println("This is Rect drawing!!!");
	}
}

class Square extends Rectangle{
	
	void draw() {
		System.out.println("This is Square drawing!!!");
	}
}

public class Shape {
	//Create a class named Shape as base class and create the subclasses named Circle,Rectangle,
	//Square. Override the draw method in the subclasses.
	
	void draw() {
		System.out.println("This is Shape!!!");
	}
	

	public static void main(String[] args) {
		
		Square s = new Square ();
		s.draw();
		

	}

}
