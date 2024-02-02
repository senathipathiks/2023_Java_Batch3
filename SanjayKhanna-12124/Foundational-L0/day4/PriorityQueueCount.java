package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCount {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		queue.add(40);
		queue.add(20);
		queue.add(30);
		queue.add(10);
		System.out.println("Queue : "+queue);
		System.out.println("Count Of Elements : "+queue.size());

	}

}
