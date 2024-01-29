package com.Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEachLambda {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner (System.in);
		
		int listSize;
		
		System.out.println("Enter the list size");
		
		listSize = sc.nextInt();
		
		System.out.println("Enter the list elements");
		
		for (int i = 0; i <listSize; i++) {
			
			list.add((sc.nextInt()));
			
		}
		
		System.out.println("Iterate By For each loop :");
		
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Iterate By Lambda For each loop :");
		// by lambda for each
	 list.forEach((n)->System.out.print(n+" "));
		

	}

}
