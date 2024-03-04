package com.java2;

import java.util.ArrayList;

public class ObjectList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		  list.add(10);
		  list.add(40);
		  list.add(432);
		  list.add("Dharshsun");
		  System.out.println(list);
		  System.out.println(list.get(0));
		  list.remove(1);
		  System.out.println(list);
		  System.out.println(list.size());//3
		  list.set(0, 20);
		  System.out.println(list);
	}

}
