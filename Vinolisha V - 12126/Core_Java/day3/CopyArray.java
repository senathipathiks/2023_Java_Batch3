package com.day3;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int arr1[]=arr.clone(); //clone is used to copy the value
		//int arr1[]=arr;
		for(int i:arr1) {
			System.out.println("Copy of the array is:" + i);
		}

	}

}
