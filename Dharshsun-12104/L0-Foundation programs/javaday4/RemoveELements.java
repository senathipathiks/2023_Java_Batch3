package com.javaday4;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveELements {
	public static void main(String args[]) {
	Queue<Integer> q1 = new PriorityQueue<>();
	q1.offer(10);
	q1.offer(80);
	q1.offer(90);
	q1.offer(30);
	q1.offer(40);
	q1.offer(40);
	System.out.println(q1);
	q1.clear();
	System.out.println(q1);

}
}
