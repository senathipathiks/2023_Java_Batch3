package com.oops.day4;


class Shape{
	double calculateArea() {
		System.out.println("All shape is having own Area");
		return 0;		
	}
	
}

class Circle extends Shape{
	
	double calculateArea() {
	
		int radius=5;
		return 3.14*radius*radius;		
		
	}
	
}

class Rectangle extends Shape{

	double calculateArea() {
		
		int length=10;
		int breadth=6;
		return length*breadth;
	
	}
	
}

class TriAngle extends Shape{

	double calculateArea() {
		int base=5;
		int height=10;
		return 0.5*base*height;
	}
}


public class CalculateTheArea {
	public static void main(String[] args) {
	
		Circle circleArea=new Circle();
		System.out.println("Area of circle is : "+circleArea.calculateArea());
		
		Rectangle rectArea=new Rectangle();
		System.out.println("Area of Rectangle is : "+rectArea.calculateArea());
		
		TriAngle triArea=new TriAngle();
		System.out.println("Area of Triangle is : "+triArea.calculateArea());	

	}

}
