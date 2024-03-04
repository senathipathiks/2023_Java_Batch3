package com.javaday6;

import java.util.HashMap;

public class GetKeyHash {
	public static void main(String args[]) {
		HashMap <Integer,String> hs = new HashMap <Integer,String>();
		  hs.put(1, "Red");
		  hs.put(2, "Green");
		  hs.put(3, "Black");
		  hs.put(4, "White");
		  hs.put(5, "Blue");
		  System.out.println(hs);
		  System.out.println("does key 1 exist");
		  if (hs.containsKey(1)) {
			  System.out.println("exists");
		  }
			  else {
				  System.out.println("not exists");
			  }
		  }
	}


