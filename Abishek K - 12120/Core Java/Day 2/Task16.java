//Diamond Pattern

package com.day;

public class Task16 {

	public static void main(String[] args) {
          int row=8;
          //Upper portion
          for(int i=1;i<=row;i++) {
        	  for(int j=1;j<=row-i;j++) {
        		  System.out.print(" ");
        	  }
        	  for(int j=1;j<=2*i-1;j++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
          //lower portion
          
          for(int i=row-1;i>=1;i--) {
        	  for(int j=1;j<=row-i;j++) {
        		  System.out.print(" ");
        	  }
        	  for(int j=1;j<=2*i-1;j++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
        	  
          }

	}

}
