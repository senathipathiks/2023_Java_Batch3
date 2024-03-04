package com.day1;

import java.util.Scanner;

public class AverageofArray {

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
		int average=sum/n;
		System.out.println("Average value of array elements: "+average);
		sc.close();
	}

}
