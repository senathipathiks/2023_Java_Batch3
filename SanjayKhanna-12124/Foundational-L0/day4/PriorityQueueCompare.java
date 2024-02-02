package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueCompare {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		Queue<Integer>queue1 = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue1 : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		System.out.println("Enter Size of Queue2 : ");
		int size1 = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size1;i++) {
		queue1.offer(sc.nextInt());
		}
		int count=0;
		if(size==size1) {
		for(Integer i:queue) {
			for(Integer j:queue1) {
				if(i==j) {
					count++;
					break;
				}
			}
			
		}
		if(count==size) {
			System.out.println("Two Queue are Equal");
		}
		else
			System.out.println("Two Queue are Not Equal");
		}
		else
			System.out.println("Two Queue are Not Equal");
	}

}
