package com.day10;

class Shapes{
	double getArea() {
		System.out.println("Space cover by a shape is known as Area");
		return 0;
	}
	
	double getPerimeter() {
		System.out.println("Distance round the shape is Known as Perimeter");
		return 0;
	}
}

class Circles extends Shapes{
	int radius = 7;
	double pi = 3.14;
	
	double getArea() {
		return pi*radius*radius;
	}
	
	double getPerimeter() {
		return 2*pi*radius;
	}
	
}

class Rectangles extends Shapes{
	double len = 10;
	double wid = 20;
	double getArea() {	
		return len*wid;
	}
	double getPerimeter() {
		return 2*(len+wid);
	}
	
}

class Triangles extends Shapes{
	double base = 10;
	double heigth = 20;
	double getArea() {
		return 0.5*base*heigth;
	}
	double getPerimeter() {
		return 3*base;
	}
	
}

public class MainClass6 {

	public static void main(String[] args) {
		Circles circle = new Circles();
		System.out.println("Radius of Circle : "+circle.radius);
		System.out.println("Area of Circle : "+circle.getArea());
		System.out.println("Circumference of circle : "+circle.getPerimeter());
		System.out.println("--------------------------------------");
		Rectangles rectangle = new Rectangles();
		System.out.println("Lenght of Rectangle : "+rectangle.len);
		System.out.println("Width of Rectangle : "+rectangle.wid);
		System.out.println("Area of Rectangle : "+rectangle.getArea());
		System.out.println("Perimeter of Recatangle : "+rectangle.getPerimeter());
		System.out.println("--------------------------------------");
		Triangles triangle = new Triangles();
		System.out.println("Lenght of Triangle : "+triangle.base);
		System.out.println("Height of Triangle : "+triangle.heigth);
		System.out.println("Area of Triangle : "+triangle.getArea());
		System.out.println("Perimeter of Equilateral Triangle : "+triangle.getPerimeter());
		System.out.println("--------------------------------------");
	}

}
