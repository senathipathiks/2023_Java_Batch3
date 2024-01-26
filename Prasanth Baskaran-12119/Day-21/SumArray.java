package com.Day3;

import java.util.Iterator;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		
		int arr[]=new int[10];
		
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter the Array 10 Values :");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
			sum= sum+arr[i];
			
		}
		
		
//		
//		for (int i : arr) {
//			
//			
//			sum = sum+i;
//			
//		}
		
		System.out.println("Sum of array is :"+ sum);
		
		int avg = (sum/10);
		
		System.out.println("Average of array is :"+avg);
		
		
		System.out.println("**************************************************");
		
		//array copy
		
		int arr1[]= new int[10];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			arr1[i]=arr[i];
			
			System.out.println(arr1[i]);
			
		}
		
		

	}

}
