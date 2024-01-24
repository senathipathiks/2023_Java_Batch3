package com.day3;
import java.util.Arrays;
public class CopyArray {
public static void main(String[] args) {
	int arr1[]={250,40,30,25};
	int arr2[]=arr1.clone();
	for (int i : arr2) 
	{
		System.out.println(i);
	}
	
}
}

//int arr2[]=arr1;
	//int arr2[]=new int[5];
	//System.arraycopy(arr1, 1, arr2, 0, 3);