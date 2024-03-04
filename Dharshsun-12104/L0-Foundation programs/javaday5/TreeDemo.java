package com.javaday5;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		System.out.println(set);
		System.out.println("enter the element to search: ");
		int K = new Scanner(System.in).nextInt();
		boolean flag = false;
		for(int i : set) {
			if(K == i) {
				flag = true;
				System.out.println("Element found");
		
			}
				if(flag = false) {
					System.out.println("element not found");
	
				}
		
				//way-2
				if(set.contains(K)) 
				System.out.println("element found");
				else
			    System.out.println("element not found");			
				}
					
	}

	}


