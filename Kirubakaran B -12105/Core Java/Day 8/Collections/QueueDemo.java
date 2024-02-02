package day5collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> queue = new LinkedList <Integer>();
	        queue.offer(10);// inserting
	        queue.offer(40);
	        queue.offer(20);
	        queue.offer(30);
	        System.out.println(queue);
	        
	        System.out.println("---------------");
	        queue.poll(); // removing
	        System.out.println(queue);
	        
	        System.out.println("---------------");

	        System.out.println(queue.peek());//return top element
	        System.out.println("---------------");

	        for ( ; queue.size()>0;) { //way-1
	            System.out.println(queue.poll());
	        
	        }
	        for (Integer intr: queue) {
	        	 System.out.println(intr);
			}
	       
	}

}
