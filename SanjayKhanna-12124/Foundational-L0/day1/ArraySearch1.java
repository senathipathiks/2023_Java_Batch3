package com.day1;

import java.util.Scanner;

public class ArraySearch1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		String s[] = new String[3];
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Elements  : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Specific value to check : ");
		int elem=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(elem==arr[i]) {
				System.out.println("Specific value found!! ");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Specific value is not found!!");
		}

	}

}
