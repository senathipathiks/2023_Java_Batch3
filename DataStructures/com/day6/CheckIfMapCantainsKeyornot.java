package com.day6;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfMapCantainsKeyornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map= new HashMap<Integer,String>();
		    map.put(1, "Red");
		    map.put(2, "Green");
		    map.put(3, "Black");
		    map.put(4, "White");
		    map.put(5, "Blue");
		    while(true){
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enetr the key:");
		    
		    int k=sc.nextInt();
		    if(map.containsKey(k)) {
		    	System.out.println("Yes key is Contain");
		    }
		    else {
		    	System.out.println("NO Yes key is Contain");
		    }
	}

}}
