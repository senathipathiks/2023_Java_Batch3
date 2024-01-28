package com.day3array;

import java.util.Scanner;


public class SumAndAvgArray {

	public static void main(String[] args) {
		int n, sum=0; 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total number of elements: ");
	n=sc.nextInt();
	int a[]=new int [n];
	System.out.println("Enter the  numbers");
	for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	sum=sum+a[i];
	}
	System.out.println("Sum of the array:"+sum);
	int avg=sum/n;
	System.out.println("Average of the number is:"+avg);
	
	

	}
	

}
