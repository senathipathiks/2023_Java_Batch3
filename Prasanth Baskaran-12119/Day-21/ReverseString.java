package com.Day3;

import java.util.*;
import java.util.Iterator;



public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Java is a Programming Language";
	
//		char []c= s.toCharArray();
//		
//		String rev ="";
//		
//	 for (int i= c.length-1; i>=0; i--) {
//		 
//		 rev += c[i];
//		  
//		
//	}
//	 
//	 System.out.println(rev);
		
		String []s1 = s.split(" ");
		
		String rev ="";
		
		for (int i= s1.length-1;i>=0; i--) {
			
		  rev+=s1[i]+" ";
			
		}
		
		System.out.println(rev);
	 

	 
	
	}

}
