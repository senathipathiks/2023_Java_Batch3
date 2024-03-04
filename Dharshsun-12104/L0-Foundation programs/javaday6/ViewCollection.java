package com.javaday6;

import java.util.HashMap;

public class ViewCollection {
	public static void main(String args[]) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"Red");
	hm.put(2,"Green");
	hm.put(3,"Black");
	hm.put(4,"White");
	hm.put(5,"Blue");
	 System.out.println("Collection view is: "+ hm.values());

}
}
