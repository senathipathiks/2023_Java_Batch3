package com.day24;

class CalculateArea{
	void area() {
		System.out.println("Area of circle : "+(3.14*7*7));
	}
	void area(int side) {
		System.out.println("Area of Square : "+(side*side));
	}
	void area(int len,int wid) {
		System.out.println("Area of Rectangle : "+(len*wid));
	}
}

public class MethodOverloadingExample1 {

	public static void main(String[] args) {
		CalculateArea obj = new CalculateArea();
		obj.area();
		obj.area(10);
		obj.area(7,8);

	}

}
