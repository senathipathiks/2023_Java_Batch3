package com.day1;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int arrSize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		arrSize=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int j=0;j<arrSize;j++) {
			arr[j]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arrSize;i++) {						
			for(int j=0;j<arrSize-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Reversing : ");
		for(int i=0;i<arrSize;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
