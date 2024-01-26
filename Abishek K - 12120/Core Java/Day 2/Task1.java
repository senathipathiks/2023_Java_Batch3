//Write a Java program that takes a number as input and 
//prints its multiplication table up to 10.

package com.day;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the Table To Print: ");
	int tbl=obj.nextInt();
	for(int i=1;i<=10;i++) {
		int out=i*tbl;
		System.out.println(i+"x"+tbl+"="+out);
	}
	
	}

}
