package com.day6;

import java.util.Arrays;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 21, 2, 5, 10, 20, 3 };
		System.out.println("before sorting the elements:" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("after sorting the elements:" + Arrays.toString(a));

	
	}}


