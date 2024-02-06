package com.day23;

import java.util.Scanner;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[10];
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 System.out.println("Enter Array Element :");
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int[] dupArr = new int[size];
		 int k= -1;
		 for(int i=0;i<size;i++) {
			 boolean count=false;
			 for(int j=i+1;j<size;j++) {
				 if(arr[i]==arr[j])
					 count=true;
			 }
			 if(count) {
				 dupArr[++k]=arr[i];
			 }
		 }
		 System.out.print("\nDuplicate Element : ");
		 for(int i=0;i<k;i++) {
			 System.out.print(dupArr[i]+" ");
		 }
		 sc.close();
	}

}
