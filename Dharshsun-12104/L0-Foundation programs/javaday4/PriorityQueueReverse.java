package com.javaday4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueReverse {
	public static void main(String args[]) {
		Queue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());//gives priority in descending order
		queue1.offer(40);
		System.out.println(queue1);
		
		queue1.offer(10);
		System.out.println(queue1);
		
		queue1.offer(30);
		System.out.println(queue1);
		
		queue1.offer(20);
		System.out.println(queue1);
		
		System.out.println("-----------------");
		
		queue1.poll();
		System.out.println(queue1);
		
		queue1.poll();
		System.out.println(queue1);
		
		queue1.poll();
		System.out.println(queue1);
	}

}
