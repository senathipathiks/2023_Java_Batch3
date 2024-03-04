package com.java3;

import java.util.LinkedList;

public class ProgList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(11);
		list.add(60);
	   
		System.out.println(list);
		
		LinkedList<Integer> reverseList = new LinkedList<Integer>();
		for(int i=list.size()-1; i>=0; i--) {
			Integer t = list.get(i);
			reverseList.add(t);
		}
		System.out.println(reverseList);
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i) %2 == 0) {
				System.out.println("even number" + list.get(i));
			}
				else {
					System.out.println("odd number" + list.get(i));
					
					
				}
			}
		}
	}


