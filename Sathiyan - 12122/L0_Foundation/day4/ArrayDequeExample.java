package com.day4;

import java.util.*;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<>();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		
		System.out.println(deque);
		
		deque.addFirst(1);
		deque.addLast(2);
		System.out.println(deque);
		
		
		deque.pollFirst();
		deque.pollLast();
		System.out.println(deque);
		
		System.out.println("First Element is : "+deque.peekFirst());
		System.out.println("Last Element is : "+deque.peekLast());
		
	}

}
