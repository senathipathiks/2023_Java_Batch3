package com.day1;
import java.util.*;
public class SortingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of elements: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the all elements: ");
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}sc.close();

}}
