package com.Day3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class ArraySort {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int arr[]= new int[5];
		
		System.out.println("Enter the Array values :");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("************Sort using Method****************");
		Arrays.sort(arr);
		
		
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
			 if(arr[i]>arr[j]) {
				 
				   temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				 
			
				 
				 
			 }
			 
			 
				
			}
			
		}
		
		System.out.println("After sorting the Array");
		
		System.out.println("**********************************");
		
		
	 for (int i : arr) {
		System.out.println(i);
	}
	
	 
	 System.out.println("*******************Array Copy new ***************");
	 
	 int[] arr1 = new int[5];
	 
	 System.arraycopy(arr, 0, arr1, 0, 5);
	 
	 for (int i : arr1) {
		System.out.println(i);
	}
	 
	 
	 System.out.println("***********************To string Method**************");
	 
	 System.out.println(Arrays.toString(arr1));
	 
	
	 
	 
	 
	 

	}

}
