package com.day4;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueSample {

	public static void main(String[] args) {
		
		Deque<Integer> dequ=new LinkedList<>();
		dequ.offer(10);
		dequ.offer(20);
		dequ.offer(30);
		dequ.offer(40);
		dequ.offer(50);
		
		System.out.println(dequ);
		
		
		dequ.offerFirst(1);
		dequ.offerLast(2);
		System.out.println(dequ);
		
		dequ.pollFirst();
		dequ.pollLast();
		System.out.println(dequ);
		
		System.out.println("First Element is : "+dequ.peekFirst());
		System.out.println("Last Element is : "+dequ.peekLast());
		
	}

}
