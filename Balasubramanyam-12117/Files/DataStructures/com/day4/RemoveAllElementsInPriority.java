package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveAllElementsInPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(40);
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(50);
		System.out.println(pq);
	    pq.removeAll(pq);
		System.out.println(pq);
	}

}
