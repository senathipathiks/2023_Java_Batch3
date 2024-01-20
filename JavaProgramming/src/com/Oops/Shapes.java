package com.Oops;
class shape{
	void draw() {
		System.out.println("draw the shapes");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Draw shape is circle");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("Draw shape is triangle");
	}
}
class squre extends shape{
	void draw() {
		System.out.println("Draw shape is squre");
	}
}
public class Shapes {

	public static void main(String[] args) {
	shape a = new shape();
	a.draw();
	circle b = new circle();
	b.draw();
	triangle c = new triangle();
	c.draw();
	squre d = new squre();
	d.draw();

	}

}
