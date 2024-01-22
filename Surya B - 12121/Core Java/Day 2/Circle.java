package com.coreDay2;

import java.util.Scanner;

public class Circle {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of the Circle : ");
		double radius = sc.nextDouble();
		
		double area = 3.14 * (radius * radius);
		
		System.out.println(area);
		
		double peri = 2 * 3.14 * radius;
		
		System.out.println(peri);
	}
}
