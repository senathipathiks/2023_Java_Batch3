package com.day10;  //queue is first in first out

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollections {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(20);
		queue.offer(10);
		queue.offer(30);
		queue.offer(60);
		queue.offer(50);
		
		System.out.println(queue);
		
		System.out.println();
		queue.poll(); // it will remove fist one which you have entered in the first
		System.out.println(queue);
		
		System.out.println();
		System.out.println(queue.peek()); //it will show the first one
		}

}
