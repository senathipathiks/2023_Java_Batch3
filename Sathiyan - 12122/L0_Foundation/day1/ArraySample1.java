package com.day1;

import java.util.*;
public class ArraySample1 {
	public static void main(String[] args) {
		int array[]=new int[5];
		
		System.out.println("Array Elements are : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Enter 5 values");
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

}
