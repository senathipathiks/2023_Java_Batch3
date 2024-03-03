package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class RetrieveandRemoveFisrtElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qq=new LinkedList<Integer>();
		   qq.offer(8);
		   qq.offer(2);
		   qq.offer(3);
		   qq.offer(4);
		   qq.offer(5);
		   qq.offer(6);
		   System.out.println(qq);
		   System.out.println(qq.peek());
		   System.out.println(qq.remove());
		   
	}

}
