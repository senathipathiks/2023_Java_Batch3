package com.day1.core;

class Shape{
	void draw() {
		System.out.println("Every shape is having a different structure");
	}
}

class Circle{
	void draw() {
		System.out.println("Circle having a Rounde structure");
	}
}

class Rectangle{
	void draw() {
		System.out.println("Reactangle has having 2 Lengther side and 2 Shorter side");
	}
}

class Square{
	void draw() {
		System.out.println("Square having all the four side as equal size");
	}
}

public class ShapeDriver {

	public static void main(String[] args) {
		Shape sref=new Shape();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		sref.draw();
		s.draw();
		r.draw();
		c.draw();
	}
}
