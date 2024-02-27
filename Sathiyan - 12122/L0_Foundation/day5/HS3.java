package com.day5;

import java.util.*;

public class HS3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();

		set.add(50);
		set.add(20);
		set.add(25);
		set.add(10);
		set.add(40);
		set.add(60);
		
		System.out.println(set);
		
		System.out.println("Enter the element to Search : " );
		int k=sc.nextInt();
		
		boolean flag=false;
		for (Integer i : set) {
			if (k==i) {
				flag=true;
				System.out.println("Element is present");
				break;
			}
		}
		if (flag==false) {
			System.out.println("Element Not found");
		}
		sc.close();	
	}

}
