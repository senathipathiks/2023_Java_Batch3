package com.day23;

//import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[10];
		 
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 
		 System.out.println("Enter Array Element :");
		 
		 
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 //Arrays.sort(arr);
		 
		 for(int i=0;i<size;i++)
			 for(int j=0;j<size-1;j++)
				 if(arr[j]>arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr [j+1];
					 arr[j+1]=temp;
				 }
		 
		 System.out.print("Sorted Array : ");
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
		 //System.out.println(Arrays.toString(arr));
		 
		 sc.close();
	}

}
