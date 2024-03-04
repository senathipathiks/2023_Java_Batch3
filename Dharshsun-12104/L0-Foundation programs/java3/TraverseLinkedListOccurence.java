package com.java3;
import java.util.LinkedList;
import java.util.Scanner;

public class TraverseLinkedListOccurence {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(11);
		list.add(60);
		list.add(10);
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("The search element");
		int in = sc.nextInt();
		int count = 0;
	   
		for(int i =0;i<list.size();i++) {
	        int t=list.get(i);
	        if(in==t) {
	        	count++;
	        }
	    	}
	   if(count == 0) {
		   System.out.println("The element i found at the list");
	   }
	  System.out.println("The element"+in +"occurs"+ count);
	}
	}




