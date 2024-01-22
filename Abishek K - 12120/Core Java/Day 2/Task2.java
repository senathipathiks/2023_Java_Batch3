//Write a Java program to print the area and perimeter of a circle.

package com.day;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: ");
		int r=obj.nextInt();
		float pi=3.14f;
		float area=pi*r*r;
		float peri=2*pi*r;
		System.out.println("Area of the Circle: "+area);
		System.out.println("Perimeter of the Circle: "+peri);
		
	}

}
