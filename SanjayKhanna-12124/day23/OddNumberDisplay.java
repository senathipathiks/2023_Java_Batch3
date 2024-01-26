package com.day23;

import java.util.Scanner;

public class OddNumberDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter Array Size :");
        int size = sc.nextInt();
        System.out.println("Enter Array Element :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
       
        System.out.print("\nArray elements : ");
        for(int i=0;i<size;i++)
        	System.out.print(arr[i]+" ");
        
        System.out.print("\nOdd values : ");
        for(int i=0;i<size;i++)
        	if(arr[i]%2==1)
        		System.out.print(arr[i]+" ");
        sc.close();

	}

}
