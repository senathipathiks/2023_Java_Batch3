package com.day3;

import java.util.Arrays;

public class UniqueElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 1, 8, 9, 2 };
		int j=0;
		int arr1[] = new int[arr.length];
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i]!= arr[i + 1])
				arr1[j++] = arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
}
