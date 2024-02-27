package com.day2.core;
import java.util.*;
public class Average {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the first value : ");
		int num1=sc.nextInt();
		
		System.out.print("Enter the second value : ");
		int num2=sc.nextInt();
		
		System.out.print("Enter the third value : ");
		int num3=sc.nextInt();
		
		double avg=(num1+num2+num3)/3;
		
		System.out.println("Average is : "+avg);

	}

}
