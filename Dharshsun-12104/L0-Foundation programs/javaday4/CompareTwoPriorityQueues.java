package com.javaday4;

import java.util.PriorityQueue;
import java.util.Queue;

public class CompareTwoPriorityQueues {
	public static void main(String args[]) {
		Queue<Integer> q1= new PriorityQueue<>();
		Queue<Integer> q2= new PriorityQueue<>();
		q1.offer(10);
		q1.offer(80);
		q1.offer(90);
		q1.offer(30);
		q1.offer(40);
		System.out.println(q1);
		q2.offer(10);
		q2.offer(800);
		q2.offer(90);
		q2.offer(30);
		q2.offer(40);
		System.out.println(q2);
		for(int i :q1) {
			System.out.println(q2.contains(i) ? "yes" : "no" );
		}
		
		
	}

}
