package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class CompareTwoPriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		Queue<Integer> pq1=new PriorityQueue<>();
		pq.offer(40);
		pq.offer(0);
		pq.offer(20);
		pq.offer(10);
		pq.offer(5);
		System.out.println(pq);
		pq1.offer(40);
		pq1.offer(30);
		pq1.offer(20);
		pq1.offer(10);
		pq1.offer(5);
		System.out.println(pq1);
		for (Integer e : pq){
			System.out.println(pq1.contains(e));
		}
		
	}}
	

