package com.day22;

import java.util.Scanner;

public class AreaPerimeterCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of circle : ");
		int rad = sc.nextInt();
		double pi = 3.14;
		System.out.println("Area of circle : "+String.format("%.2f",pi*rad*rad)+"squnit");
		System.out.println("Perimeter of circle : "+String.format("%.2f",2*pi*rad)+"unit");
		

	}

}
