package com.day1;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		int[] arr=new int[10];
		int arrSize,elem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		arrSize=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int j=0;j<arrSize;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter the element and position : ");
		elem=sc.nextInt();
		int pos=sc.nextInt();
		arrSize++;
		for(int i=arrSize-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=elem;
		System.out.println("After Insertion : ");
		for(int i=0;i<arrSize;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
