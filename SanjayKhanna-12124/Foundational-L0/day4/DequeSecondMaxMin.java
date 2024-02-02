package com.day4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class DequeSecondMaxMin {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Deque<Integer> deque1 = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		deque.add(sc.nextInt());
		}
		Object arr[]=deque.toArray();									//Converting into Array
		Arrays.sort(arr);												//Using sort function
		System.out.println("Second Largest Element : "+arr[size-2]);	//Maximum
		System.out.println("Second Smallest Element : "+arr[1]);		//Minimum
		

	}

}
