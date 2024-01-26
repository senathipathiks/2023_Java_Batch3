package com.day4;

import java.util.LinkedList;
import java.util.Deque;

public class Deqqqq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Deque<Integer> dq=new LinkedList<>();
		  dq.offer(1);
		  dq.offer(2);
		  dq.offer(3);
		  dq.offer(4);
		  dq.add(5);
		  dq.offer(6);
	      System.out.println(dq);
	      dq.offerFirst(8);
	      dq.offerLast(9);
	      System.out.println(dq);
	      dq.pollFirst();
	      dq.pollLast();
	      System.out.println(dq);
	      dq.peekFirst();
	      dq.peekLast();
	      System.out.println(dq);
	      
	      
	       
	}

}
