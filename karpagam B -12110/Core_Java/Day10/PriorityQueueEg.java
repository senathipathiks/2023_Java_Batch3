package Com.Day10;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		Queue<Integer> queue = new  PriorityQueue<Integer>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(45);
        System.out.println(queue);
        System.out.println("-------------");
         
        queue.poll();//remove element based on priority
        System.out.println(queue);
        System.out.println("-------------");

        for (Integer i:queue) { 
			System.out.println(i);
	}
	}

}
