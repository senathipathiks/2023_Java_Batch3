package rel.com.day10.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		System.out.println(q.peek());
		q.poll();
		System.out.println(q);
	}

}
