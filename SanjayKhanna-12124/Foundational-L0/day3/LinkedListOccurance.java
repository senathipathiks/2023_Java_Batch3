package com.day3;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOccurance {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Enter the No of Element to add: ");
		int listSize = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the Element to find Occurance : ");
		int elem = sc.nextInt();
		int count=0;
		
		for(int i=0;i<listSize;i++) {
			if(elem==list.get(i))
				count++;
		}
		if(count==0)
			System.out.print("Element is not Occured\n No of Time: "+count);
		else
			System.out.print("Element is Occured\nNo of Time: "+count);
	}

}
