package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQColors {

	public static void main(String[] args) {
		Queue<Object> que=new PriorityQueue<>();
		que.add("Red");
		que.add("Blue");
		que.add("Purple");
		que.add("Yellow");
		que.add("White");
		que.add("Green");
		que.add("Violet");
		que.add("Indigo");
		
		System.out.println(que);

	}

}
