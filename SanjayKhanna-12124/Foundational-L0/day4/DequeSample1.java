package com.day4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeSample1 {

	public static void main(String[] args) {
		Deque<Integer>deque = new LinkedList<Integer>();
		deque.offer(10);
		deque.offer(20);
		deque.offer(30);
		deque.offer(40);
		System.out.println("Deque : "+deque);
		deque.offerFirst(5);
		deque.offerLast(50);
		System.out.println("Deque : "+deque);
		deque.pollFirst();
		deque.pollLast();
		System.out.println("Deque : "+deque);
		System.out.println("Deque PeekFirst() : "+deque.peekFirst());
		System.out.println("Deque PeekLast() : "+deque.peekLast());
		
	}

}
