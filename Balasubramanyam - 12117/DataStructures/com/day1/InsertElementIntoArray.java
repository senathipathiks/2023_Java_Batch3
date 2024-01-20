package com.day1;

import java.util.*;

public class InsertElementIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the elements:");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the adding element:");
		int c=sc.nextInt();
		System.out.println("Enter the Position:");
		int position=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i==position) {
				a[i]=c;
				System.out.println(a[i]);
			}
		}
		sc.close();
		
		}  
	}


