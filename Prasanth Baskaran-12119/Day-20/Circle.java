package com.Day2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter the Radius of Circle :");
			
			int r = sc.nextInt();
			
			int area = (int) (3.14*(r*2));
			
			System.out.println("The area is :"+area);
			
			float perimeter =  (2 * 3.14f*r);
			
			System.out.println("The Perimeter is :"+perimeter);
		}

	}

}
