package com.day4;

import java.util.*;

public class QueueExamle {

	public static void main(String[] args) {
		
		Deque<Integer> que=new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(450);
		que.add(50);
		que.add(60);
		que.add(70);
		que.add(80);

		System.out.println(que);
		
		Object[] arr=que.toArray();
		Arrays.sort(arr);
		
		
		System.out.println("Second Smallest : "+arr[1]);
		System.out.println("Second Largest : "+arr[arr.length-2]);
	}
}
