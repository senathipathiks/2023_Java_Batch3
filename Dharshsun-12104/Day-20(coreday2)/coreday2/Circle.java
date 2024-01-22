package com.coreday2;
import java.util.Scanner;

public class Circle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double radius = sc.nextDouble();
		double area = calculateArea(radius);
		double perimeter = calculatePerimeter(radius);
		
		System.out.println("Area of circle:"+area);
		System.out.println("Perimeter of circle:"+perimeter);
	}
	private static double calculateArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	private static double calculatePerimeter(double radius) {
		return 2*Math.PI*radius;
	}
	}

