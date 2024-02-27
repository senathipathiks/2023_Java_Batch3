package com.day4;

import java.util.*;

public class QueueSample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<String> queue=new PriorityQueue<>();
		System.out.println("Enter the number of String you want to Enter : ");
		int num=sc.nextInt();
		System.out.println("Enter the Strings : ");
		for (int i = 0; i < num; i++) {
			queue.add(sc.next());
		}
		System.out.println(queue);
		sc.close();
	}

}
