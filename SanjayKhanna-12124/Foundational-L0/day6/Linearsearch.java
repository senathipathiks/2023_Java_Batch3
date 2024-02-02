package com.day6;

import java.util.Scanner;

public class Linearsearch {
	private static Scanner sc;

	public static int search(int[] arr, int arr_size, int elem) {
		int i=0,flag=-1;
		while(i<elem) {
			if(arr[i]==elem) {
				return i+1;
			}
			i++;
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		int[] arr=new int[10];
		int arr_size,elem;
		sc = new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		arr_size=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<arr_size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element : ");
		elem=sc.nextInt();
		int pos=search(arr,arr_size,elem);
		if(pos==-1)
			System.out.printf("Element %d is not present in Array",elem);
		else
			System.out.printf("Element %d is present at %d position in Array ",elem,pos);
		
	}

}
