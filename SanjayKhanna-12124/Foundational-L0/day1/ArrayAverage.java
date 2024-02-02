package com.day1;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Elements  : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		sum+=arr[i];	
		}
		System.out.println("Average : "+sum/arr.length);

	}

}


