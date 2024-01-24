package com.corejava.day3;
import java.util.Scanner;

public class CopyMethod {
	public static void main(String[] args) {
		
		int[] copy= {1,2,3,4,5,6};
		
	  int[] x=new int[copy.length];
	  
	  System.arraycopy(copy, 4, x, 2, 2);
	  
	  /* In This 
	    Copy--> main array
	    4--> where to copy in the main array
	    x--> pasting array
	    2--> where to paste
	    3--> no of values going to paste
	    */
	  for (int i : x) {
		System.out.println(i);
	}
	}

}
