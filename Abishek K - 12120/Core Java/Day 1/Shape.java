package com.day1;

class Shape1{
	void shp() {
		System.out.println("There Are Three Shapes");
	}
}
class Rectangle extends Shape1{
	void shp() {
		System.out.println("Rectangle has four sides");
	}
}
class Circle extends Shape1{
	void shp() {
		System.out.println("Angle of the Circle is 360");
	}
}
class Square extends Shape1{
	void shp() {
		System.out.println("In Square All sides are Equal");
	}
}

public class Shape {

	public static void main(String[] args) {
		Shape1 obj = new Shape1();
		obj.shp();

	}

}
