package com.day3array;
import java.util.Scanner;
public class UniqueElements {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique Elements are:");
        for(int j=0;j<arr.length;j++) {
        	for(int k=j+1;k<arr.length;k++) {
        		if(arr[j]!=arr[k]) {
        			System.out.println(arr[k]);
        		}
        	}
        }

	}

}
