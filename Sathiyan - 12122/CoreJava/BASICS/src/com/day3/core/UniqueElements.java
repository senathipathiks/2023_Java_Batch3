package com.day3.core;

import java.util.HashSet;

public class UniqueElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,4,2};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Integer num : set) {
			System.out.println(num);
		}
	}
}
