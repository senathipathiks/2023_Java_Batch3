package com.day6;
import java.util.*;
public class GetCollectionViewfromValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	  hash_map.put(1,"Red");
	  hash_map.put(2,"Green");
	  hash_map.put(3,"Black");
	  hash_map.put(4,"White");
	  hash_map.put(5,"Blue");
	 
	  System.out.println("Collection view is: "+ hash_map.values());
	}

}
