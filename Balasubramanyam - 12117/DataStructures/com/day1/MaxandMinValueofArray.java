package com.day1;

import java.util.Scanner;

public class MaxandMinValueofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = src.nextInt();
        int arr[] = new int[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element: ");
            arr[i] = src.nextInt();
        }
        int max = arr[0], min = arr[0];
		for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) { 
                min = arr[i];
            }
        }
		System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
        src.close();
}}
