package com.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchinginArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      ArrayList<Object> list =new ArrayList<>();
	      System.out.println("enter the total num of elements:");
	      int n=sc.nextInt();
	      System.out.println("enetr the "+n+" elements");
	      for(int i =0;i<n;i++) {
	    	  
	    	  int t=sc.nextInt();
	    	  list.add(t);
	      }
	      System.out.println(list);
//		  searching
	      boolean flag =false;
	      System.out.println("enter the searching element");
	      int k=sc.nextInt();
	      for(int i=0;i<list.size();i++) {
	    	  if(k==(int)list.get(i)) {
	    		  flag=true;
	    		 System.out.println("the searching element is found at:"+i);
	    		 break;
	    	  }
	      }
	      if(flag==false) {
	    	  System.out.println("the searching element is not found");
	      }
//	      //removing the element
	      boolean flag1 =false;
	      System.out.println("enter the removing element");
	      int k1=sc.nextInt();
	      for(int i=0;i<list.size();i++) {
	    	  if(k1==(int)list.get(i)) {
	    		  flag=true;
//	    		  list.remove(i);
	    		 System.out.println("removing the element:"+list.remove(i));
	    		 break;
	    	  }
	      }
	      if(flag==false) {
	    	  System.out.println("the element is not found");
	      }
	      System.out.println(list);
		
		
		}}
	
