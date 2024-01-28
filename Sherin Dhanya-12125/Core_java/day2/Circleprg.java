package com.day2;

import java.util.Scanner;

//Write a Java program to print the area and perimeter of a circle
public class Circleprg {

	public static void main(String[] args) {
		System.out.println("enter the radius of the circle");
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		
		System.out.println("Area of the circle:"+3.14*r*r);
		System.out.println("Perimeter of the circle:"+2*3.14*r);

	}

}
