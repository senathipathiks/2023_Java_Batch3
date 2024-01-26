//4. Write a Java program to print the area and Perimeter of a circle.

package com.day2;
import java.util.Scanner;

public class AreaPerimeterCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pi=3.14;
		
		System.out.println("Enter radius:");
		
		int r=sc.nextInt();
		double a=2*pi*r*r;
		System.out.println("Area of a Circle is:"+ a);
		
		double b=2*pi*r;
		
		System.out.println("Area of a Perimeter is:"+b);
		
		
	

	}

}
