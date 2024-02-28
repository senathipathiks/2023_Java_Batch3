package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Priority Que sets the priority to smallest Value
		in Ascending Order...*/
		
		Queue<Integer> que=new PriorityQueue<>();
		que.add(10);
		System.out.println(que);
		
		que.add(2);
		System.out.println(que);
		
		que.add(5);
		System.out.println(que);
		
		que.add(3030);
		System.out.println(que);
		
		que.add(52642);
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		

	}

}
