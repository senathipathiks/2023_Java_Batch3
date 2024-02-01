package Java_Day_10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> que=new PriorityQueue<Integer>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(15);
		que.add(25);
		
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		System.out.println(que.offer(0));

	}

}
