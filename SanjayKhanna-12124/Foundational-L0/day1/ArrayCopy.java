package com.day1;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr[] = new int[5];//array
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Elements  : ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[5];//New Array
		for(i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("After copying :");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		

	}

	}
}
