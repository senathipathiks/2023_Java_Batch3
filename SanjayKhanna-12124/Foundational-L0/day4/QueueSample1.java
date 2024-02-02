package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample1 {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.add(60);
		System.out.println("Queue :"+queue);
		queue.poll();
		System.out.println("Queue :"+queue);
		
		System.out.println("Queue peek() : "+queue.peek());
		
	}

}
