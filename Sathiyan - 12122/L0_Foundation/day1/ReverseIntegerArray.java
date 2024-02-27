package com.day1;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		int a[]= {1,4,5,6,7,8};
		System.out.println("Before Converting Reverse");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("After Reversing");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
			
		}
		
		
	}

}
