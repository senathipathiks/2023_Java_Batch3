package com.day23;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr1 = new int[10];
		 int[] arr2 = new int[10];
		 
		 //int[] arr3 = arr1; or int[] arr3 = arr.clone();
		 //System.arraycopy(arr1, 0, arr2, 0, 0);
		 
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 
		 System.out.println("Enter Array Element :");
		 		 
		 for(int i=0;i<size;i++) {
			 arr1[i]=sc.nextInt();
			 arr2[i]=arr1[i];
		 }
		 
		 System.out.print("Copied Array Element : ");
		 for(int j : arr2)
			 System.out.print(j+" ");
		 sc.close();

	}

}
