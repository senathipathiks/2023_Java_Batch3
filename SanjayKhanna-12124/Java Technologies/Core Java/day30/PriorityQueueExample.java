package com.day30;

import java.util.*;

public class PriorityQueueExample {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int value = 0;
		char op = ' ';
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		do {
			System.out.println("Enter a Number");
			value = sc.nextInt();
			queue.offer(value);
			System.out.println("Are you want to add more ?[y/n]");
			op = sc.next().charAt(0);
		}while(op=='y');
		
		System.out.println("Queue : "+queue);
		System.out.println("Peek() : "+queue.peek());
		System.out.println("Poll() : "+queue.poll());
		System.out.println("Poll() : "+queue.poll());
		System.out.println("Queue : "+queue);
	}

}
