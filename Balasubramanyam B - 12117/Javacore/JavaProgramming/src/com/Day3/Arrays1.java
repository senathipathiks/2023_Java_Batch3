package com.Day3;

public class Arrays1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		String names[]= {"A","B","C","D","E"};
		System.out.println("Array Length is: "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		for(String s:names) {
			System.out.println(s);
		}
	}

}
