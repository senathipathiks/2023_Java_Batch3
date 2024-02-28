package com.day3.core;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		String name[]= {"Sathya","Visu","Deeps"};
		
		System.out.println(arr.length);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (String s : name) {
			System.out.println(s);
		}

	}

}
