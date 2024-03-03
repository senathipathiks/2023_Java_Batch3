package com.day6;
import java.util.*;
import java.util.Map.Entry;
public class SetView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap < Integer, String > map = new HashMap < Integer, String > ();
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(3, "Black");
		  map.put(4, "White");
		  map.put(5, "Blue");
		  Set<Entry<Integer, String>> set= map.entrySet();
		  System.out.println("set is: "+set);
	}
}
