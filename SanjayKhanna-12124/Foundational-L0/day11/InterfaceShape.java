package com.day11;

interface Shapes{
	double getArea();
}

class Rectangle implements Shapes{
	double length = 10;
	double width = 10;
	public double getArea() {
		return length*width;
	}
}

class Triangles implements Shapes{
	double length = 10;
	double height = 20;
	public double getArea() {
		return 0.5*length*height;
	}
}

class Circles implements Shapes{
	double radius = 10;
	double pi = 3.14;
	public double getArea() {
		return pi*radius*radius;
	}
}

public class InterfaceShape {

	public static void main(String[] args) {
		Circles circle = new Circles();
		System.out.println("Radius of Circle : "+circle.radius +" cm");
		System.out.println("Area of Circle : "+circle.getArea()+" sqcm");
		System.out.println("--------------------------------------");
		Triangles triangle = new Triangles();
		System.out.println("Lenght of Triangle : "+triangle.length+" cm");
		System.out.println("Height of Triangle : "+triangle.height+" cm");
		System.out.println("Area of Triangle : "+triangle.getArea()+" sqcm");
		System.out.println("--------------------------------------");
		Rectangle rectangle = new Rectangle();
		System.out.println("Lenght of Rectangle : "+rectangle.length+" cm");
		System.out.println("Height of Rectangle : "+rectangle.width+" cm");
		System.out.println("Area of Triangle : "+rectangle.getArea()+" sqcm");
		System.out.println("--------------------------------------");

	}

}
