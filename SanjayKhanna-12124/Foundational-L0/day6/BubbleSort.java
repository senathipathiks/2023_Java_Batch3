package com.day6;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		int arrSize=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		int n=arrSize;
		System.out.println("Array Before Sort : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n-1;j++,n--) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;			
				}
			}
		}
		System.out.println("Array After Sort : "+Arrays.toString(arr));

	}

}
