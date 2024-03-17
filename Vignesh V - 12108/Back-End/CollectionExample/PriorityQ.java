package com.corecollection;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
      queue.add(10);
      queue.add(2);
      queue.add(5);
      queue.add(6);
      System.out.println(queue);
      queue.poll();
      System.out.println(queue);
      queue.clear();
      System.out.println(queue);
      System.out.println(queue.offer(2));
      
	}

}
