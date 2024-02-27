package com.oops.day5;

interface shapess{
	void CalculateArea();
}


class Circle1 implements shapess{
	
	int radius=5;
	
	public void CalculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle is : "+area);	
	}	
}

class Triangle1 implements shapess{
	
	int base=5,height=10;
	
	public void CalculateArea() {
		double area=0.5*base*height;
		System.out.println("Area of Triangle is : "+area);	
	}
	
}

class Rectangle implements shapess{
	
	int length=10,breadth=5;
	
	public void CalculateArea() {
		double area=length*breadth;
		System.out.println("Area of Reactangle is : "+area);	
	}
	
}

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapess s=new Circle1();
		shapess s2=new Triangle1();
		shapess s3=new Rectangle();
		s.CalculateArea();
		s2.CalculateArea();
		s3.CalculateArea();
		

	}

}
