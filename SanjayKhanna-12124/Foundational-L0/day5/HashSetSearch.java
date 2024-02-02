package com.day5;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetSearch {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Set : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++) {
		set.add(sc.nextInt());
		}
		System.out.println("Set : "+set);
		System.out.println("Enter a element to Search :");
		int elem = sc.nextInt();
		boolean flag= false;
		for(Integer i:set) {
			if(elem==i) {
				flag=true;
				System.out.println("Element is Found");
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element is Not Found");
		}
		System.out.println("Enter a element to Search :");
		int elem1 = sc.nextInt();
		//way2
		set.remove(0);
		System.out.println("Set : "+set);
		if(set.contains(elem1)) {
			System.out.println("Element is Found");
		}
		else
			System.out.println("Element is Not Found");
	}

}
