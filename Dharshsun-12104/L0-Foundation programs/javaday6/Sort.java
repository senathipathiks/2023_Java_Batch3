package com.javaday6;
import java.util.Arrays;


public class Sort{
	

public static void main(String[] args) {
			
			int arr[] = {-9,-2,3,420,69,21,5,49,18,7,45},temp = 0;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length-1; j++) {
					if (arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println("Sorted array : "+Arrays.toString(arr));
}
}


