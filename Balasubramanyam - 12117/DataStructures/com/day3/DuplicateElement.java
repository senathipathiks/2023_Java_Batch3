package com.day3;

import java.util.*;

public class DuplicateElement {
       public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
   		Scanner sc = new Scanner(System.in);
   		ll.add(10);
   		ll.add(20);
   		ll.add(10);
   		ll.add(40);
   		ll.add(50);
   		ll.add(40);
   		ll.add(70);
   		ll.add(80);
   		ll.add(90);
   		ll.add(10);
   		System.out.println("Enter the searching elemenet");
   		int k=sc.nextInt();
   		
   		int c =0;
   		for(int i=0;i<ll.size();i++) {
   			if(k==ll.get(i))
   			c++;
   		}
   	    System.out.println("The Element: "+ c);sc.close();}}
