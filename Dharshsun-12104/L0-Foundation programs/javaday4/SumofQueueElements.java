package com.javaday4;

import java.util.LinkedList;
import java.util.Queue;

public class SumofQueueElements {
	public static void main(String args[]) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		queue1.offer(40);
		queue1.offer(50);
		System.out.println(queue1);
		int count = 0;
		
		for(int num : queue1) {
		count += num;
			
	}
		
		System.out.println("sum of all elements " + count);
}
}
