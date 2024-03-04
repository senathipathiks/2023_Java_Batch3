package com.javaday4;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuetoArray {
	public static void main(String args[]) {
	Queue<Integer> q1= new PriorityQueue<Integer>();
	q1.offer(10);
	q1.offer(80);
	q1.offer(90);
	q1.offer(30);
	q1.offer(40);
	System.out.println(q1);
	Object arr[] = q1.toArray();
	System.out.println("the array is:" + Arrays.toString(arr));
}
}
