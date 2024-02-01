package day_10;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer>q1=new LinkedList<Integer>();
		Queue<Integer>q2=new LinkedList<Integer>();
		
		q1.offer(22);
		q1.offer(32);  // adding element in list
		q1.offer(42);
		q1.offer(52);
		q1.offer(62);
		// q1.add(12); we can also use add because it is common method
		System.out.println(q1);
		
		// removing element in list
		q1.poll();
		q1.remove(); // remove also we can use because it is common method
		
		// peek is used to return the first element 
		
		System.out.println("first element is "+ q1.peek());
		System.out.println(q1);
		
		System.out.println("size is "+q1.size());
		
		System.out.println("********");
		
		for (Integer i: q1) {
			System.out.println(i);
		}
		
		System.out.println("********");
		Iterator<Integer>it= q1.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******");
		
		for (;q1.size()>0;) {
			System.out.println(q1.poll());
		}
		

	}

}
