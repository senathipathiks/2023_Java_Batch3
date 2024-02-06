package com.day9.collectionapi;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		Queue <String>q = new PriorityQueue<>();
		
		q.offer("Prashanth");
		q.offer("Surangam");
		q.offer("Jothi");
		q.offer("Sena");
		System.out.println(q);
		
		
		
		for (String string : q) {
			
			System.out.print(string+" ");
		}

	}

}
