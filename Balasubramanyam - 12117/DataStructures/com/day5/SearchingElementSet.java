package com.day5;

import java.util.*;

public class SearchingElementSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the searching elemenet: ");
		int k=sc.nextInt();
		
		boolean flag=false;
		for(Integer i:set) {
			if(k==i) {
				flag=true;
				System.out.println("The Searching element is found");
				break;
			}
		
		}
if(flag==false) {
	System.out.println("The Searching element is not found");
		}


System.out.println("---------------------------------------------------------------");

    if(set.contains(k)) {
    	System.out.println("The Searching element is found");
    	
    }
    else {
    	System.out.println("The Searching element is not found");
    }sc.close();
	}

}
