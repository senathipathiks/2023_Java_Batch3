package com.day3.core;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		int arr[]= {1,2,30,40,5,6,7,8,9,10};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
