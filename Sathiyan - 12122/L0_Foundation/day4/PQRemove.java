package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQRemove {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		que.add(60);
		
		System.out.println("Before Removing : "+que);
		
		que.removeAll(que);
		
		System.out.println("After removing : "+que);

	}

}
