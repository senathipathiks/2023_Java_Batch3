package com.day6;
import java.io.*;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of arr: ");
    int a=sc.nextInt();
    int arr[]=new int[a];
    System.out.println("Enter the elements: ");
    for(int i =0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    for(int i =0;i<arr.length-1;i++) {
    	int index=i;
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[j]<arr[index]) {
    			index=j;
    		}
    	}
    	int smallerNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallerNumber;  
    }
    
    for(int i =0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
	}

}
