package com.Day3;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr[]=new int[]{50,10,20,30,40};
		int arr1[]=new int[5];
		
		System.arraycopy(arr, 1, arr1, 1, 3);
        for(int i:arr1) {
        	System.out.println(i);
        }
        int arr2[]=arr.clone();
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
