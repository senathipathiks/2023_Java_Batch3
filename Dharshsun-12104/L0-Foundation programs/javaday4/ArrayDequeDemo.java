package com.javaday4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeDemo {
	public static void main(String Args[]) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		queue.offerFirst(1);
		queue.offerLast(2);
		System.out.println(queue);

}
}
