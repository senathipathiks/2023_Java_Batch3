package com.day6;

import java.util.Scanner;

public class BinaryRecursion {

	private static Scanner s;
	public static int search(int a[],int lower,int upper,int elem) {							//User Defined method with formal parameter
		
		if(upper>=lower) {
			int mid=(lower+upper)/2;
			if(a[mid]==elem)
				return mid;
			else if(a[mid]<elem)
				return search(a,mid,upper,elem);												//Using Recursion
			else
				return search(a,lower,mid,elem);
		}
			return -1;
		
	}
	public static void main(String[] args) {
		int i,n,elem;
		int[] a = new int[10];
		s = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		n=s.nextInt();
		System.out.print("Enter the Array elements in the Sorted order (Ascending) : ");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();																	//Getting input from user
		System.out.print("Enter the element for Searching... : ");
		elem=s.nextInt();
		int result = search(a,0,n-1,elem);														//Function call with Actual parameter
		if(result==-1)
			System.out.printf("The Element %d is not present in this array",elem);
		else
			System.out.printf("The Element %d is present at %d index ",elem,result);
	}
}
