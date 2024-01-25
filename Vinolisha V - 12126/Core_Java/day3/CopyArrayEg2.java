package com.day3;

public class CopyArrayEg2 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		 int arr1[]=new int[5];
		 
		 System.arraycopy(arr, 2, arr1, 1, 3);
		 for(int  i:arr) {
			 System.out.println("Copy of the array is:" + i);
		 }
		 
	}

}
