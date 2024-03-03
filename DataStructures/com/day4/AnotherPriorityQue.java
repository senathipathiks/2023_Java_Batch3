package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class AnotherPriorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq=new PriorityQueue<>();
		pq.offer("RED");
		pq.offer("BLACK");
		pq.offer("WHITE");
		pq.offer("PINK");
		pq.offer("BLUE");
		System.out.println(pq);
		Queue<String> pq1=new PriorityQueue<>();
		pq1.addAll(pq);
		System.out.println(pq1);
	}

}
