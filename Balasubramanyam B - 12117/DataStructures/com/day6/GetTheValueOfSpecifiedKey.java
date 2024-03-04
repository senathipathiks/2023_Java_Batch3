package com.day6;
import java.util.*;
public class GetTheValueOfSpecifiedKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1,"My");
		map.put(3,"Home");
		map.put(2,"Tall");
		System.out.println(map);
	    System.out.println(map.get(3));
	}

}
