package com.day3;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Enter the No of Element to add: ");
		int listSize = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Main Linked list : "+list);
		LinkedList<Integer> oddList=new LinkedList<Integer>();
		LinkedList<Integer> evenList=new LinkedList<Integer>();
		
		for(int i=0;i<listSize;i++) {
			if(list.get(i)%2==0){
				evenList.add(list.get(i));
			}
			else {
				oddList.add(list.get(i));
			}
		}
		System.out.println("Even Linked list : "+evenList);
		System.out.println("Odd Linked list : "+oddList);
		
	}

}
