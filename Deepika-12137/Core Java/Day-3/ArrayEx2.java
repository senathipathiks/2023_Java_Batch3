package com.day3;
import java.util.*;
import java.util.Arrays;
public class ArrayEx2 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values : ");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			sum=sum+i;
		}
		System.out.println("The sum of the elements "+sum);
		int avg=sum/10;
		System.out.println("The average of an elements "+avg);

	}

}
