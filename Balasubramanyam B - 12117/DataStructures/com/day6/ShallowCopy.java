package com.day6;
import java.util.*;
public class ShallowCopy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> map= new HashMap<Integer,String>();
    map.put(1, "Red");
    map.put(2, "Green");
    map.put(3, "Black");
    map.put(4, "White");
    map.put(5, "Blue");
    System.out.println("Before getting a shallow copy of a HashMap instance: "+map);
    map.clone();
    System.out.println("After getting a shallow copy of a HashMap instance: "+map);
  
	}

}
