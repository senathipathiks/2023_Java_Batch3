package com.javaday6;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	
System.out.println("Enter the value of array size  :");

int n = sc.nextInt();

int arr[] = new int[n];

System.out.println("Enter the array values  :");


for(int i =0;i<arr.length;i++) {
	
	arr[i]= sc.nextInt();
	
}


System.out.println("*****************Before Sorting************************");

for (int i : arr) {
	System.out.print(i+" ");
}





for (int i=0;i<n-1;i++) {  // 5 2 1 4 5

int index = i;


for(int j=i+1;j<n;j++) {
	
	if(arr[j]<arr[index]) {
		
		index = j ; // search low index
			
	}
}
	if(index!=i) {
	int temp = arr[index];
	
	arr[index] = arr[i];
	
	
	arr[i] = temp ;
	}
	
	

}

System.out.println();

System.out.println("*******************After Sorting************************");

         
System.out.println(Arrays.toString(arr));       // converting array into string   
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]+" ");
//}
}

}


