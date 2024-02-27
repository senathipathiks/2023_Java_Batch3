package com.Day_9;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> ref=new PriorityQueue<String>();
		
		ref.add("Sathya");
		ref.add("Tamizh");
		ref.add("Siva");
		
		System.out.println(ref);
		
		ref.remove();
		
		System.out.println(ref);
		
	}

}
