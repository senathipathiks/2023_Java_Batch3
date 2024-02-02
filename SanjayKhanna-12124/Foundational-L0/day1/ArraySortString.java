package com.day1;

import java.util.Arrays;

public class ArraySortString {
	public static void main(String[] args) {
		String[] str = { "sanjay","sathiya","prasanth","suriya","sri","prem"};
		String temp="";
		System.out.println("Before Sorting : ");
		for(int i=0;i<str.length;i++) {
			System.out.print(" "+str[i]);
		}
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
				
			}
		}
		
		System.out.println();
		System.out.println("After Sorting : ");
		
		for(int i=0;i<str.length;i++) {
			System.out.print(" "+str[i]);
		}
	}
}
		

