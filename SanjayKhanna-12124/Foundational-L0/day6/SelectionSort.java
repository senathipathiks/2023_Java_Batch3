package com.day6;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Before Sorting : ");
		for(int i:arr){
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index])
					index=j;
			}
			if(index!=i) {
				int temp = arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
		}
		System.out.print("\nAfter Sorting : ");
		for(int i:arr){
			System.out.print(i+" ");
		}
	}

}
