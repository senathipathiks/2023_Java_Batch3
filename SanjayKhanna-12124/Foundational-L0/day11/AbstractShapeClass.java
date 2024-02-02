package com.day11;

abstract class Shape {
	abstract double calArea();
	abstract double calPerimeter();
}

class Circle extends Shape{
	double radius = 7;
	double pi = 3.14;
	double calArea() {
		return pi*radius*radius;
	}
	double calPerimeter() {
		return 2*pi*radius;
	}
}
class Triangle extends Shape{
	double length = 10;
	double height = 20;
	double calArea() {
		return 0.5*length*height;
	}
	double calPerimeter() {
		return 3*length;
	}
}
public class AbstractShapeClass {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Radius of Circle : "+circle.radius +" cm");
		System.out.println("Area of Circle : "+circle.calArea()+" sqcm");
		System.out.println("Circumference of circle : "+circle.calPerimeter()+" cm");
		System.out.println("--------------------------------------");
		Triangle triangle = new Triangle();
		System.out.println("Lenght of Triangle : "+triangle.length+" cm");
		System.out.println("Height of Triangle : "+triangle.height+" cm");
		System.out.println("Area of Triangle : "+triangle.calArea()+" sqcm");
		System.out.println("Perimeter of Equilateral Triangle : "+triangle.calPerimeter()+" cm");
		System.out.println("--------------------------------------");
		

	}

}
