package com.day1;
import java.util.*;

public class ArraySearch {

	public static void main(String[] args) {
		// Initializing the array elements
		int arr[]= {1,2,3,4,5,6};
		int k,flag=0;		
		System.out.print("Enter the element to Search : ");
		//Getting value from the user 
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();	
		for (int i=0; i<arr.length; i++) {
			if (k==arr[i]) {
				System.out.println("Array element present in the index : " + i);
				flag++;
				break;
			}
		}
		if (flag==0) {
			System.out.println("Element is Not Present");	
		}
		sc.close();
	}
}
