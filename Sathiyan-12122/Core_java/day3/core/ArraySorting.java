package com.day3.core;

//import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[]= {10,40,30,20,26};
		int tmp = 0;
		
//		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++){  
			for (int j = i + 1; j < arr.length; j++){  
				  
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
