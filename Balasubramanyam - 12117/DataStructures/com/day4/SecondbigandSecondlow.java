package com.day4;

import java.util.*;


public class SecondbigandSecondlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> dq=new LinkedList<>();
		  dq.offer(4);
		  dq.offer(2);
		  dq.offer(3);
		  dq.offer(1);
		  dq.offer(5);

		  Object arr[]=dq.toArray();
		  Arrays.sort(arr);
		  System.out.println();
		  System.out.println(arr[1]);
		  System.out.println(arr[arr.length-2]);
		  
		  }
	}


