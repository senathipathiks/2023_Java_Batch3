package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class RetrievefirstElementPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(10);
		pq.offer(5);
		System.out.println(pq);
		
		System.out.println("Retrieve first element of the priority queue is: "+pq.peek());
		
	}

}
