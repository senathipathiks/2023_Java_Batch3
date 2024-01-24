package com.day3;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int arr1[]={250,40,30,25};
		Arrays.sort(arr1);
		
		for (int i : arr1) 
		{
		System.out.println(i);
		}
		System.out.println(Arrays.toString(arr1));
}
}