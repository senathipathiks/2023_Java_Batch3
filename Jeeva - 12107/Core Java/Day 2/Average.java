package com.coreDay2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// Average of 3 Numbers
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Three Numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int sum = a+b+c;
		
		int avg = sum/3;
		
		System.out.println(avg);

	}

}
