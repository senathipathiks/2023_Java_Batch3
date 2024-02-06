package com.day23;

import java.util.Scanner;

public class MergeSort {
	
	void merge(int arr[],int beg,int mid,int end) {
		int i,j,k;
		int n1 = mid - beg + 1;    
	    int n2 = end - mid; 
	    
	    int leftArray[] = new int[n1];
	    int rightArray[] = new int[n2];
	    
	    for (i = 0; i < n1; i++)    
	        leftArray[i] = arr[beg + i];    
	        for (j = 0; j < n2; j++)    
	        rightArray[j] = arr[mid + 1 + j];    
	          
	        i = 0;
	        j = 0;  
	        k = beg;  
	          
	        while (i < n1 && j < n2)    
	        {    
	            if(leftArray[i] <= rightArray[j])    
	            {    
	                arr[k] = leftArray[i];    
	                i++;    
	            }    
	            else    
	            {    
	                arr[k] = rightArray[j];    
	                j++;    
	            }    
	            k++;    
	        }    
	        while (i<n1)    
	        {    
	            arr[k] = leftArray[i];    
	            i++;    
	            k++;    
	        }    
	          
	        while (j<n2)    
	        {    
	            arr[k] = rightArray[j];    
	            j++;    
	            k++;    
	        }    
	    }    
	      
	    
	
	
	void mergeSort(int arr[],int beg,int end) {
		
		if(beg<end) {
			int mid = (beg+end)/2;
			mergeSort(arr, beg, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,beg,mid,end);
		}
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[10];
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 System.out.println("Enter Array Element :");
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 MergeSort m = new MergeSort();
		 m.mergeSort(arr, 0, size-1);
		 System.out.print("\nArray After Sort : ");
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
		 sc.close();

	}

}
