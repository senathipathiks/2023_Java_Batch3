package com.day3;

import java.util.*;

public class LinkedListOccuranceFinder {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element you need to enter : ");
		int num_element=sc.nextInt();
		System.out.println("Enter the Values : ");
		for (int i = 0; i < num_element; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);	
		System.out.println("Enter the element you want to find the Count : ");
		int input=sc.nextInt();
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==input) {
				count++;
			}
		}
		if (count==0) {
			System.out.println("Element Present : "+ count + " Times");
		}else {
			System.out.println("Element Present : "+ count + " Times");
		}
		sc.close();
	}
}
