package CorejavaDay10;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionEx4Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> que=new PriorityQueue<String>();
		que.offer("Vishnu");
		que.offer("Surya");
		que.offer("Venkat");
		que.offer("Mohana");
		System.out.println(que);
		que.poll();
		System.out.println(que);
		System.out.println(que.peek());
		
		//System.out.println(que.get());
		
	}

}
