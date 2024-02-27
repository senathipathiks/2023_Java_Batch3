package com.day1;

public class ArraySample2 {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		
		System.out.println("Array Elements are : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		int array1[]=new int[] {10,20,33,40,50};
		System.out.println("Array1 Elements are : ");
		for (int i : array1) {
			System.out.println(i);
			
		}
	}

}
