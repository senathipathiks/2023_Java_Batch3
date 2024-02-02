package com.day1;

import java.util.Scanner;

public class ArraySearch {


	public static void main(String[] args) {
		int[] arr=new int[10];
		int arrSize,elem,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		arrSize=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int j=0;j<arrSize;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter the Search Element : ");
		elem=sc.nextInt();
		
		for(i=0;i<arrSize;i++) {
			if(elem==arr[i]) {
				System.out.println("Element found at position: "+(i+1));
				break;
			}
		}
		if(i==arrSize) {
			System.out.println("Element is not found");
		}
		sc.close();
	}

}
