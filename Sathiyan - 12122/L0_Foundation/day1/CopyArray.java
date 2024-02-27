package com.day1;

public class CopyArray {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5,6,7,8,9};
		int array2[]=new int[10];
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);			
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i]=array1[i];
			
		}	
		System.out.println();
		for (int i = 0; i < array2.length-1; i++) {
			System.out.print(array2[i]);
			
		}
	}
}
