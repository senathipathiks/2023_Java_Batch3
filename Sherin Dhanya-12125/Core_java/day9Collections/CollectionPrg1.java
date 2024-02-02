package com.day9Collections;
import java.util.*;
public class CollectionPrg1 {

	public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(91);
	arr.add(12);
	arr.add(3);
	arr.add(7);
	//arr.addAll(arr);
	System.out.println(arr);
	System.out.println("------------------------------");
	Collections.sort(arr);
	System.out.println(arr);
	System.out.println("------------------------------");
	arr.remove(3);
	System.out.println(arr);
	System.out.println("------------------------------");
	System.out.println(arr.get(2));
	
	
	}

}
