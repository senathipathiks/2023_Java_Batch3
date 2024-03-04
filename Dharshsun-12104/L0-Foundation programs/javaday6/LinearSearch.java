package com.javaday6;

import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearch {
   public static void main(String args[]) {
	   ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to search:");
		int t = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<list.size(); i++) {
			if(t==list.get(i)) {
				flag = true;
				System.out.println("element found");
				break;
				
				
			}else {
				flag = false;
				System.out.println("element not found");
				break;
			}
		}
		
   }
}
