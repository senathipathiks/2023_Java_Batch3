package com.day10;

class Shape{
	double calArea() {

		System.out.println("Space cover by a shape is known as Area");
		return 0;
	}
}

class Circle extends Shape{
	int radius = 7;
	double pi = 3.14;
	double calArea() {
		return pi*radius*radius;
	}
	
}

class Rectangle extends Shape{
	double len = 10;
	double wid = 20;
	
	double calArea() {	
		return len*wid;
	}
	
}

class Triangle extends Shape{
	double base = 10;
	double heigth = 20;
	
	double calArea() {
		return 0.5*base*heigth;
	}
	
}



public class MainClass3 {

	public static void main(String[] args) {
	Circle circle = new Circle();
	System.out.println("Radius of Circle : "+circle.radius);
	System.out.println("Area of Circle : "+circle.calArea());
	System.out.println("--------------------------------------");
	Rectangle rectangle = new Rectangle();
	System.out.println("Lenght of Rectangle : "+rectangle.len);
	System.out.println("Width of Rectangle : "+rectangle.wid);
	System.out.println("Area of Rectangle : "+rectangle.calArea());
	System.out.println("--------------------------------------");
	Triangle triangle = new Triangle();
	System.out.println("Lenght of Rectangle : "+triangle.base);
	System.out.println("Height of Rectangle : "+triangle.heigth);
	System.out.println("Area of Triangle : "+triangle.calArea());

	}

}
