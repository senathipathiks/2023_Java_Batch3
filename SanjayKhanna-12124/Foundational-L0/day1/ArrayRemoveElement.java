package com.day1;

import java.util.Scanner;

public class ArrayRemoveElement {

	public static void main(String[] args) {
		int arr[] = new int[5];
		boolean flag=false;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Elements  : ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Specific value to remove : ");
		int elem=sc.nextInt();
		for(i=0;i<arr.length;i++) {
			if(elem==arr[i]) {
				flag=true;
				break;
				}
			}
		if(flag==false) {
			System.out.println("Specific value is not present");
			}
		else {
		for(int j=i;j<arr.length-1;j++) {
			arr[j]=arr[j+1];}
		arr[arr.length-1]=0;
		System.out.println("After removing :");
		for(i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}}

}
