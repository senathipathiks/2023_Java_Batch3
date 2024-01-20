package com.day1;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of size: ");
		int n = sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("enetre the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];}
		System.out.println("Sum of array is: "+sum);
		sc.close();

}}
