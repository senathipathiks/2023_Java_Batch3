package com.corejava.day3;

public class Arrays {
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
