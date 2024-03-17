package com.coreday2;
import java.util.*;
public class ArrayEx3 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		int arr1[]=new int[2];
		System.arraycopy(arr, 2, arr1, 0, 2);
		for (int i : arr1) {
			System.out.println();
			
		}
		
	}

}
