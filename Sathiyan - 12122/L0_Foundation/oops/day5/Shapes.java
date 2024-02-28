package com.oops.day5;


abstract class Shape{
	
	abstract void CalculateArea();
	abstract void CalculatePerimeter();
}

class Circle extends Shape{
	
	int radius=5;
	
	void CalculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle is : "+area);
		
	}
	
	void CalculatePerimeter() {
		double perimeter=2*3.14*radius;
		System.out.println("Perimeter of a Circle is : "+perimeter);
	}	
}

class Triangle extends Shape{
	
	int base=5,height=10;
	
	void CalculateArea() {
		double area=0.5*base*height;
		System.out.println("Area of Triangle is : "+area);	
	}
	
	void CalculatePerimeter() {	
		double perimeter=3*base;
		System.out.println("Perimeter of the Triangle is : "+perimeter);	
	}
}

public class Shapes {

	public static void main(String[] args) {
		Shape s =new Circle();
		Shape s2=new Triangle();
		s.CalculateArea();
		s.CalculatePerimeter();
		s2.CalculateArea();
		s2.CalculatePerimeter();

	}

}
