package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQAddingElements {

	public static void main(String[] args) {
		Queue<String> que =new PriorityQueue<>();
		que.add("Yellow");
		que.add("red");
		que.add("Orange");
		que.add("white");
		
		for (String i : que) {
			System.out.println(i);		
		}

	}

}
