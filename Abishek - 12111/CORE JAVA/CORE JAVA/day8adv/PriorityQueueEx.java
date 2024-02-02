package com.day8adv;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> prioque = new PriorityQueue<Integer>(Collections.reverseOrder());
		prioque.offer(30);
		prioque.offer(20);
		prioque.offer(10);
		prioque.offer(120);
		prioque.offer(50);
		prioque.offer(40);
		System.out.println(prioque);
		System.out.println();
		prioque.poll();
		System.out.println(prioque);
		prioque.poll();
		System.out.println(prioque);
	}

}
