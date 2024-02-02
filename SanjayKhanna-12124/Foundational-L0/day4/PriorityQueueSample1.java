package com.day4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueSample1 {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		queue.add(40);
		System.out.println("Queue : "+queue);
		queue.add(20);
		System.out.println("Queue : "+queue);
		queue.add(30);
		System.out.println("Queue : "+queue);
		queue.add(10);
		System.out.println("Queue : "+queue);
		queue.add(5);
		System.out.println("Queue : "+queue);
		queue.add(1);
		System.out.println("Queue : "+queue);
		System.out.println("----------------------");
		queue.poll();
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println("Queue : "+queue);
		
		
		
		

	}

}
