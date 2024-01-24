package com.day3;
import java.util.Arrays;
public class DuplicateElement {
public static void main(String[] args) {
      int arr[]= {1,4,2,1,6,9,6};
      int count=0;
      for (int i = 0; i < arr.length; i++) 
      {
    	  for (int j = i+1; j < arr.length; j++) 
    	  {
    		  if (arr[i]==arr[j])
    		  {
    			  count++;  
    		  }
    	  }	
	}
      System.out.println(count);
}
}
