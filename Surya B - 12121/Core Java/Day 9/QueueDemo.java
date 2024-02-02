package com.coreDay9;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.offer("Jeevanantham");
		p.offer("Kathiresan");
		p.offer("Shirag");
		System.out.println(p);
		
		p.poll();
		System.out.println(p);

	}

}
