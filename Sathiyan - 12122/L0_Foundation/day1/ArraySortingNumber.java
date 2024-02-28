package com.day1;

public class ArraySortingNumber {

	public static void main(String[] args){   
	int[] arr = new int[] {78, 34, 1, 3, 90, 34}; 
	System.out.println("Element Before sorting:");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Array elements after sorting:");
	for (int i = 0; i < arr.length; i++){  
		for (int j = i + 1; j < arr.length; j++){  
			int tmp = 0;  
			if (arr[i] > arr[j]){  
				tmp = arr[i];  
				arr[i] = arr[j];  
				arr[j] = tmp;  
			}  
		}  
		System.out.print(arr[i]+" ");  
		}  
	}  
}  
