package com.day4;

import java.util.*;

public class PQCompare {

	public static void main(String[] args) {
		
		Queue<Integer> que1=new PriorityQueue<>();
		que1.add(10);
		que1.add(20);
		que1.add(30);
		que1.add(40);
		que1.add(50);
		
		Queue<Integer> que2=new PriorityQueue<>();
		que2.add(10);
		que2.add(20);
		que2.add(30);
		que2.add(40);
		que2.add(90);
		
		int count=0;
		
		if (que1.size()==que2.size()) {
			for (Integer i : que1) {
				for (Integer j : que2) {
					if (i==j) {
						count++;
					}
				}	
			}
			if (count==que1.size()) {
				System.out.println("Both the Queue is same");
			}else {
				System.out.println("Not same");
			}
		}
	}
}
