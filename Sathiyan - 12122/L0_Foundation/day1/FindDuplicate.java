package com.day1;

import java.util.*;
public class FindDuplicate {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the number of array do you want to store: ");
		int num=sc.nextInt();
		int array[]=new int[num+1];
		for (int i = 0; i < num; i++) {
			array[i]=sc.nextInt();	
		}
		System.out.println("Duplicate Values Present in an array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);
				}	
			}
		}
	}
}
