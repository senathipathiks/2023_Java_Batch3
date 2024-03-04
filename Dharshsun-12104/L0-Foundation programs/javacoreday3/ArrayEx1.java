package com.javacoreday3;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String s1[]) {
		int arr[] = {20,10,40,50,30};
//		String[] name = {"Dharshsun","Logesh","Prem"};
//		System.out.println(arr.length);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		
//		}
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
//		for(String s:name) {
//			System.out.println(s);
//		}
		System.out.println(arr[-1]);// array out of bound exception
	}
}
