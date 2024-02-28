package com.day3.core;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]=new int[8];
//		int arr2[]=arr1.clone();
		
//		for (int i : arr2) {
//			System.out.println(i);
//		}
		
		System.arraycopy(arr1, 2, arr2, 3, 3);
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
