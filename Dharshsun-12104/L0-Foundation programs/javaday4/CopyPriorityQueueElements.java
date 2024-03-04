package com.javaday4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CopyPriorityQueueElements {
	public static void main(String args[]) {
		Queue<Integer> q1 = new PriorityQueue<>();
		Queue<Integer> q2 = new PriorityQueue<>();
		
		q1.offer(10);
		q1.offer(80);
		q1.offer(90);
		q1.offer(30);
		q1.offer(40);
		q1.offer(40);

		Iterator<Integer> it = q1.iterator();
		while(it.hasNext())  {
		   q2.add(it.next());
		}
		System.out.println(q1);
		System.out.println(q2);
		
	}

}
