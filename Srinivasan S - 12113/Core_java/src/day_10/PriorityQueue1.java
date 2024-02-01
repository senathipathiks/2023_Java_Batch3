package day_10;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<Integer>(Collections
				.reverseOrder());
		
		q1.offer(24); // queue allows duplicates
		q1.offer(2);
		q1.add(24);
		q1.add(41);
//		for (Integer i : q1) {
//			Thread.sleep(1000);
//			System.out.println(i);
//		}
		
		q1.remove(2);
		System.out.println(q1);
		q1.offer(14);
		System.out.println(q1);
		
		System.out.println(q1.peek());
		q1.poll();
		System.out.println(q1.poll());
		System.out.println("******");
		q1.add(0);
		System.out.println(q1);
	}

}
