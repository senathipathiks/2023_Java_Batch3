package com.day1;

import java.util.*;
public class RemoveElementInArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Element Present in a Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);	
		}
		System.out.println();
		System.out.print("Enter the Element you want to remove : ");
		int input=sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (input==array[i]) {
				array[i]=0;	
			}
		}	
		
		System.out.print("After Removing the Value: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);	
		}
		sc.close();
	}
}
