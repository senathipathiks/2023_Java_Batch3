package com.day1;

import java.util.Scanner;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int arrSize;
		int[] arr1 = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		arrSize=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int j=0;j<arrSize;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Duplicate values");
		for(int j=0;j<arrSize;j++) {
			for(int i=j+1;i<arrSize;i++) {
				if(arr[i]==arr[j]){
					System.out.print(" "+arr[i]);	
				}
			}
		}
	}
}
