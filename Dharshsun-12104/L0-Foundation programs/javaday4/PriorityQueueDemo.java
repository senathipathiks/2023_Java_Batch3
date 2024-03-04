package com.javaday4;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String args[]) {
		Queue<Integer> queue1 = new PriorityQueue<>();//gives priority in ascending order
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
