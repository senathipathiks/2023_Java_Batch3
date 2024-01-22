//Write a Java program that takes three numbers as input to calculate and 
//print the average of the numbers.


package com.day;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the Third number: ");
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("The Average of the Number is: "+avg);

	}

}
