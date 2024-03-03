package com.day3;

import java.util.*;

public class ChecksElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		boolean flag =false;
	      System.out.println("Enter the checking element: ");
	      int k=sc.nextInt();
	      for(int i=0;i<stack.size();i++) {
	    	  if(k==(int)stack.get(i)) {
	    		  flag=true;
	    		 System.out.println("The given element is present in the stack.");
	    		 break;
	    	  }
	      }
	      if(flag==false) {
	    	  System.out.println("given element is not present in the stack.");}
	      sc.close();}}
