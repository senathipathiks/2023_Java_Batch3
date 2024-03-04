package com.day4;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class IterateThePriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(10);
		pq.offer(5);
		Iterator<Integer> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}{
		
	}

}
