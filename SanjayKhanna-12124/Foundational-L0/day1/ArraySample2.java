package com.day1;

import java.util.Iterator;

//import java.util.Scanner;
public class ArraySample2 {
 public static void main(String[] args) {
	 int arr[] = {10,20,30,40,50};
	 System.out.print("Array Elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int arr1[] = new int[] {10,20,30,40,50};
		System.out.print("Array Elements are : ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		
}
}
