package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQCount {

	public static void main(String[] args) {
		Queue<Integer> ue=new PriorityQueue<>();
		ue.add(10);
		ue.add(20);
		ue.add(30);
		ue.add(40);
		ue.add(50);
		
		System.out.println("Count is :  "+ue.size());
	}
}
