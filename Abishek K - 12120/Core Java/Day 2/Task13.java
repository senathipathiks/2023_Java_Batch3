//Prime number from a range

package com.day;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
       System.out.println("Enter the Range");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       
       for(int i=1;i<=n;i++) {
    	   if(!(i%2==0)) {
    		  System.out.println(i);
    	   }
    	   
       }

	}

}
