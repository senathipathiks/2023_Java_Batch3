package com.day2pto;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the First number: ");
		int a = new Scanner(System.in).nextInt();

		System.out.println("Enter the second number: ");
		int b = new Scanner(System.in).nextInt();

		int sum = a+b;
		System.out.println("Sum of the number: "+sum);
		
		int sub = a-b;
		System.out.println("Subtraction of the numbers: "+sub);
		
		int mul = a*b;
		System.out.println("Multiplication of the numbers: "+mul);
		
		int div = a/b;
		System.out.println("Division of numbers: "+div);		

	}

}
