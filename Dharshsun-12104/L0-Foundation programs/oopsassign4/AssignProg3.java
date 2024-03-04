package com.oopsassign4;



class Shape{
	public double calculateArea() {
		return 0;
	}
}

class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
		
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double width,height;
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
		
	}
	public double calculateArea() {
		return width*height;
	}
}

class Triangle extends Shape{
	double width,length;
	public Triangle(double width,double length) {
		this.width = width;
		this.length = length;
		
	}
	public double calculateArea() {
		return 0.5*width*length	;
}
public class Assignprog3 {
	public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(10, 30);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5, 15);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}

}

