package com.day3;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum=0;
		int avg;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++)  {
          arr[i] = sc.nextInt();
        }
        for(int i:arr) {
        	 System.out.println(i);
        	sum=sum+i;}
        	avg=sum/10;
        	System.out.println(sum);
            System.out.println(avg);
        
	}

}
