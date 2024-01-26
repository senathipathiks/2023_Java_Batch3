package com.day2;
import java.util.Scanner;


public class AverageNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		double a=sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		double b=sc.nextInt();
		
		System.out.println("Enter the Third Number:");
		double c=sc.nextInt();
		
		double average=a+b+c/3;
		System.out.println("Average of the number is:"+ average);

	}

}
