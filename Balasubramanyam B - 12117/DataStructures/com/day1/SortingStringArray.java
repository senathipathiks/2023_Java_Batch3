package com.day1;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string values: ");
	      String str = sc.next();
	      char a[] = str.toCharArray();
	      for(int i = 0; i < a.length; i++ ) {
	         for(int j = i+1; j < a.length; j++) {
	            if(a[i]>a[j]) {
	               char temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third largest element is: "+Arrays.toString(a));
	      sc.close();
	}
	}


