package com.javaday4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String Args[]) {
		Deque<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		queue.offerFirst(1);
		queue.offerLast(2);
		System.out.println(queue);
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue);
		
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		
		
	}

}
