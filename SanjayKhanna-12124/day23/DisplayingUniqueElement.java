package com.day23;

import java.util.Scanner;

public class DisplayingUniqueElement {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int[] arr = new int[10];
	        System.out.println("Enter Array Size :");
	        int size = sc.nextInt();
	        System.out.println("Enter Array Element :");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("\nUnique elements : ");
	        for(int i=0;i<size;i++) {
				 boolean count=true;
				 for(int j=i+1;j<size;j++) {
					 if(arr[i]==arr[j])
						 count=false;
				 }
				 if(count) {
					System.out.print(arr[i]+" ");
				 }
			 }
	        sc.close();

	}

}
