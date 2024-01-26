package com.Day2;

import java.util.Scanner;

public class AvgNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter value 1 :");
		
		int v1 = sc.nextInt();
		
		System.out.println("Enter value 2 :");
		
		int v2 = sc.nextInt();
		
		System.out.println("Enter value 3 :");
		int v3 = sc.nextInt();
		
		float avg = (v1+v2+v3/3);
		
		System.out.println("The avg is :"+avg);
		
	}

}
