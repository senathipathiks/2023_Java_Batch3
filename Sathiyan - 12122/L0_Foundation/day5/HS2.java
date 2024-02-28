package com.day5;

import java.util.*;

public class HS2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> set=new HashSet<>();
		set.add(50);
		set.add(26);
		set.add(38);
		set.add(14);
		set.add(40);
		
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
