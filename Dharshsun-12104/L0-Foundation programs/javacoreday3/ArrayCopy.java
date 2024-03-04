package com.javacoreday3;

import java.util.Scanner;

public class ArrayCopy {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the total elements:");
		n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
			
		}
//		int arr1[] = arr.clone();
		int arr1[] = new int[5];
		System.arraycopy(arr,2,arr1,1,3);
		for(int i:arr1) {
			System.out.println(i);
		}
	}
}

