package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQRetriveRemove {

	public static void main(String[] args) {
		Queue<Integer> que1=new PriorityQueue<>();
		que1.add(10);
		que1.add(20);
		que1.add(30);
		que1.add(40);
		que1.add(50);
		
		System.out.println("Before Removing : "+que1);
		
		System.out.println("Element to remove : "+que1.poll());
		
		System.out.println("After Removing : "+que1);
	}
}
