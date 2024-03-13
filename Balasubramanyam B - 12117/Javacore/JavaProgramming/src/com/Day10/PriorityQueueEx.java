package com.Day10;
import java.util.*;
public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		list.offer(10);
		list.offer(20);
		list.offer(30);
		list.offer(40);
		list.offer(60);
		list.offer(50);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);

	}

}
