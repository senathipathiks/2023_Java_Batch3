package com.day2.core;
import java.util.*;
public class TablesMultiply {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Count number : ");
		int input=sc.nextInt();
		System.out.print("Enter the table you want");
		int table=sc.nextInt();
		for (int i = 1; i <= input; i++) {
			System.out.println(i + " * " +table+ " = " + (i*table));
			
		}
	}

}
