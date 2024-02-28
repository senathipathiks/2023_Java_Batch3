package com.oops.day4;

class Shapes{
	double getArea() {
		System.out.println("All shape is having own Area");
		return 0;		
	}
	
	
}

class Circles extends Shapes{
	
	int radius=10;
	
	double getArea() {
		double area=3.14*radius*radius;		
		return area;	
	}
	
	double getPerimeter() {
		double perimeter=2*3.14*radius;
		return perimeter;
	}
	
}

class Rectangles extends Shapes{

	int length=10,breadth=8;

	
	double getArea() {
		double areaRectangle=length*breadth;	
		return areaRectangle;
	}
	
	double getPerimeter() {
		double perimeter=2*(length+breadth);
		return perimeter;
	}
	
}

class TriAngles extends Shapes{

	int base=5,height=10;
	
	double getArea() {
		double areaTriangle=0.5*base*height;
		return areaTriangle;
	}
	
	double getPerimeter() {
		double perimeter=3*base;
		return perimeter;
	}
}

public class PerimeterAndArea {

	public static void main(String[] args) {
		Circles ref=new Circles();
		System.out.println("Area of circle is : "+ref.getArea());
		System.out.println("Perimeter of the circle is "+ref.getPerimeter());
		
		TriAngles ref2=new TriAngles();
		System.out.println("Area of Triangle is : "+ ref2.getArea());
		System.out.println("Perimeter of the Triangle is "+ref2.getPerimeter());
		
		Rectangles ref3=new Rectangles();
		System.out.println("Area of Triangle is : "+ ref3.getArea());
		System.out.println("Perimeter of the Triangle is "+ref3.getPerimeter());
		
	}

}
