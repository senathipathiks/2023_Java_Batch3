package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int sum=0;	
		int length = arr.length;
		int copyArr[] = new int[arr.length];
		
		for (int i=0; i < arr.length ; i++) {
			System.out.println(i);
			arr[i] = sc.nextInt();
			copyArr[i] = arr[i];
			}
		
		for (int a: arr) {
			sum +=a;
		}
		float avg = sum/length;		
		System.out.println("The sum of array: "+sum);
		System.out.println("The average of array: "+avg);	
		System.out.println("Copy of array: "+Arrays.toString(copyArr));
	}

}
