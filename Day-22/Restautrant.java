package com.Day4;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to create a class called "Restaurant" with attributes for menu items, 
//prices, and ratings, and methods to add and remove items, and to calculate average rating.

public class Restautrant {
	
	
	static float price = 50.0f;;
	int ratings;
	
	static int sum=0;
	
	static int r=0;
	
	

	static ArrayList <String>MenuItems = new ArrayList<String>();
	
	
	
	public static void addItems (String s) {
		
		boolean flag = MenuItems.add(s);
		
		if(flag==true) {
			
			System.out.println("Menu items are added");
			
			price +=20;
		}
		
	
			
		}
	    	
	
	
      public static void removeItems(String s1) {
    	  
    	  boolean flag = MenuItems.remove(s1);
    	  
    	  if(flag==true) {
    		  
    		  System.out.println("Menu items are deleted");
    	  }
    	  else {
    		  System.out.println("Enter the Correct value");
    	  }
    	  
    	  
    	  
  
		
    	 
    	  
    	  
	}
      
      public static void Avgratings(ArrayList<Integer> rating) {
    	  
    	  for (Integer i : rating) {
    		  
    		  sum = sum+i;
			
		}
    	  
    	  int avg =0;
    	  
    	  avg = sum/rating.size();
    	  
    	  System.out.println("The average of food Rating :"+avg);
    	  
    	  
    	  
    	  
    	  
    	  
      }
      
      
      
      

      static String I;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean loop = true;
		
		
		while(loop) {
		
		System.out.println("Enter the Option : \n1.Add Item \n2.Remove Item \n3.Average Ratings");
		
		int a = sc.nextInt();
		
		
		
		switch (a) {
		case 1:
			
			System.out.println("Enter the Item Name ???");
			sc.nextLine();
			I = sc.nextLine();
			
			System.out.println(I);
			
			addItems(I);
			
			System.out.println("Your Item "+ I +" price is :"+price);
			
			System.out.println("Enter the Rating of your Food item 1 to 5 ???");
			
			 r = sc.nextInt();
			 
			 System.out.println("Thanks for your Ratings");
			

	    	  

			
			break;
			
		case 2:{
			
			System.out.println("Enter the Item you want delete ???");
			
			sc.nextLine();
			String d = sc.nextLine();
			
			removeItems(d);
		}
		break;
		
		case 3:{
			
			ArrayList <Integer>rating= new ArrayList<Integer>();
	    	  
	    	  rating.add(r);
	    	  
	    	  Avgratings(rating);
			
			
		}
		break;

		default:
			break;
		}
		System.out.println("Do you want to continue the application??? , choose \n1.Y\n2.N");

		String d0 = sc.next();

		if (d0.compareTo("N") == 0) {
			loop = false;
	

	}
		}
		}

}
