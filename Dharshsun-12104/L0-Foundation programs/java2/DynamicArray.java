package com.java2;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		System.out.println("enter"+n+"elements");
		for(int i =1;i<=n;i++) {
			int t = sc.nextInt();
			list.add(t);
		}
		System.out.println(list);
		boolean flag = false;
		System.out.println("Enter the element to search");
		int k  = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(k == list.get(i)) {
				 flag = true;
				System.out.println("The element is found at index"+i);
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element not found");
		}
		boolean flag1 = false;
		System.out.println("Enter the element to remove ");
		int k1  = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(k1 == list.get(i)) {
				 flag1 = true;
				 list.remove(i);
				System.out.println("Element Removed");
				break;
			}
		}
		if(flag1 == false) {
			System.out.println("Element not found");
		}
	}

}
