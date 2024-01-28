package com.day3array;
import java.util.Arrays;
import java.util.Scanner;
public class OddElements {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Odd Numbers are:");
        for(int j=0;j<arr.length;j++) {
        	if(arr[j]%2!=0) {
        		System.out.println(arr[j]);
        	}
        }

	}

}
