package com.day3.core;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {10,2,3,43,56,2,3,5};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}	
			}
		}
	}
}
