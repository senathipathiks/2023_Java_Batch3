package com.day6;
import java.util.ArrayList;
import java.util.Scanner;

public class LambdaExpressionEg2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		int listSize;
		System.out.println("Enter the List Size");
		listSize=sc.nextInt();
		
		System.out.println("Enter the List Element");
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Iterating using for Each:");
		
		//using for each
		
		for(int i:list)
			System.out.println(i+ " ");
		
		//lambda expression
		System.out.println("Using Lambda Expression");
		list.forEach((n)->System.out.print(n+" "));
		sc.close();
		

	}

}
