package com.javaday6;

import java.util.HashMap;

public class GetValueHash {
	public static void main(String args[]) {
		HashMap <Integer,String> hs = new HashMap <Integer,String> ();
		  hs.put(1, "Red");
		  hs.put(2, "Green");
		  hs.put(3, "Black");
		  hs.put(4, "White");
		  hs.put(5, "Blue");
		  System.out.println(hs);
		  System.out.println("does value red exist");
		  if (hs.containsValue("Red")) {
			  System.out.println("exists");
		  }
			  else {
				  System.out.println("not exists");
			  }
		  }
}
