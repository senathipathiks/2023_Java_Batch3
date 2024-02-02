package com.day22;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float d = (a+b+c)/3;
		System.out.println("Average of Three Numbers : "+String.format("%.2f",d));

	}

}
