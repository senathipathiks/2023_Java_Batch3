package com.coreday2;

public class Evenelements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		System.out.println("Even elements in given array:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
