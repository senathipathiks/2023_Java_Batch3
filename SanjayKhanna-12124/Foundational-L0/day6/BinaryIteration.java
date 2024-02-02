package com.day6;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryIteration {

	public static void main(String[] args) {
		int[] arr= {2,5,7,9,1,3,6,8,4};													//Array Declaration
		int upper=arr.length-1;
		int lower=0;
		boolean flag=false;																
		Arrays.sort(arr);																//Using Arrays.sort() to sort the array
		System.out.print("Enter the element for Searching... : ");
		@SuppressWarnings("resource")
		int elem=new Scanner(System.in).nextInt();
		while(lower<=upper) {															//Using Iteration method
			int mid=(lower+upper)/2;	
			if(arr[mid]==elem) {
				System.out.println("Element found at "+mid+" index");					//Display the output when the search is found
				flag=true;
				break;
			}
			else if(arr[mid]<elem) {
				lower=mid+1;
			}
			else {
				upper=mid-1;
			}
		}
		if(flag==false)
			System.out.println("Element Not found...!");	

	}

}
