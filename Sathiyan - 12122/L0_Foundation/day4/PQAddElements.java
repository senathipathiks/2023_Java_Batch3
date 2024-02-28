package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQAddElements {

	public static void main(String[] args) {
		Queue<Integer> que1=new PriorityQueue<>();
		Queue<Integer> que2=new PriorityQueue<>();
		
		que1.add(10);
		que1.add(20);
		que1.add(30);
		que1.add(40);
		que1.add(50);
		
		System.out.println("QUEUE 1 ELEMENTS : "+que1);
		
		for (Integer i : que1) {
			que2.add(i);
		}
		System.out.println("QUEUE 2 ELEMENTS : "+que2);
	}
	

}
