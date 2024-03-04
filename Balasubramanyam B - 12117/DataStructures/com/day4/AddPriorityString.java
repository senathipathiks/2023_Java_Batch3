package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddPriorityString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq=new PriorityQueue<>();
		pq.offer("RED");
		pq.offer("BLACK");
		pq.offer("WHITE");
		pq.offer("PINK");
		pq.offer("BLUE");
		System.out.println(pq);
	}

}
