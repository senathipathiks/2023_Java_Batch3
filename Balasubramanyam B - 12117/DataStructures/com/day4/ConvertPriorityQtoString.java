package com.day4;

import java.util.PriorityQueue;


public class ConvertPriorityQtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.offer("Balu");
		pq.offer("Muni");
		pq.offer("ramu");
		pq.offer("loki");
		pq.offer("jothi");
		System.out.println(pq);
		String in = pq.toString();
		for(String i:pq) {
		System.out.println(i);
	}

}}
