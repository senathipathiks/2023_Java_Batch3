package com.day2;

import java.util.Scanner;

//write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class AvgThreeNum {

	public static void main(String[] args) {
		System.out.println("enter the value of A");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("enter the value of C");
		int c=sc.nextInt();

		int d=(a+b+c)/3;
		System.out.println("Average of the number is: "+d);
	}

}
