package com.day2;

public class CopyofArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,23,46,38};
		
		int a1[] = new int[6];
		
		System.arraycopy(a, 0, a1, 0, 5);
		for (int i: a1) {
			System.out.println(i);
		}
	}}

