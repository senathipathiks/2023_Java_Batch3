package com.java1;

import java.util.Scanner;

public class arrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("enter 5 values:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
