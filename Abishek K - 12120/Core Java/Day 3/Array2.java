package com.day3;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		System.out.println("1st Array");
		for(int i:arr) {
			System.out.println(i);
		}
        
		//array copying 
		//int arr1[]=arr;  //int arr1[]=arr.clone(); - another method
		int arr1[] = new int[5];
		System.arraycopy(arr, 2, arr1, 1, 2);
		
		System.out.println("2nd array");
		for(int i:arr1) {
			System.out.println(i);
		}
	}

}
