package com.coreday2;

import java.util.Scanner;

public class ArrayEx2 {

	static Scanner sc = new Scanner(System.in);

	int arr[] = new int[10];

	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
	}

}
