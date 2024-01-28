package com.day3array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]=new int[4];
		/*for(int i=0;i<arr1.length;i++) {
			System.out.println("Elements in Array 1:"+i);
			
		}
		for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
		
			System.out.println("Elements in Array 2:"+i);

	}
*/

 System.arraycopy(arr1,0,arr2,0,3);
 for(int i:arr1)
 {
 System.out.println(i);
}}
}