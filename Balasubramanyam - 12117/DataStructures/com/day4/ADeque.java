package com.day4;
import java.util.*;
public class ADeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deque<Integer> ad=new ArrayDeque<>();
    ad.offer(10);ad.offer(20); ad.offer(30); ad.offer(40); ad.offer(50); 
    System.out.println(ad);
    ad.offerFirst(44);
    ad.offerLast(23);
    System.out.println(ad);
    ad.pollFirst();
    ad.pollLast();
    System.out.println(ad);
    ad.peekFirst();
    ad.peekLast();
    System.out.println(ad);
    for(Integer i:ad) {
    	System.out.println(i);
    }
}} 
