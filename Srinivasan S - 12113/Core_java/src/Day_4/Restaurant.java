package Day_4;

import java.util.ArrayList;

import java.util.Scanner;

/*
 *  Write a Java program to create a class called "Restaurant" with attributes
 *   for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating
 */



public class Restaurant {
	static Scanner sc=new Scanner(System.in);
	static String items;
	static int prices=100;
	static int ratings;
	static String sum=" ";
	static int avg;
	Restaurant(String items, int prices2, int ratings) {
		super();
		
	}
	
	ArrayList<String> list=new ArrayList<String>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	ArrayList<Integer>list2=new ArrayList<Integer>();
	
	void adddish() {
		System.out.println("Enter the dish");
		items=sc.next();
		list.add(items);
		list2.add(prices);
		System.out.println("Enter no of plate of "+items);
		int n=sc.nextInt();
		System.out.println("Your Dish is "+items+" Price of the dish is "+(n*prices));
	}
	
	void removedish() {
		items=sc.next();
		list.remove(items);
		
		
	}
	
	void ratings() {
		System.out.println("Enter the Ratings out of 5 ");
		ratings=sc.nextInt();
		if(ratings < 5) {
		 list1.add(ratings);
		 System.out.println("Ratings for the food is "+ ratings );}
		else
			System.out.println("Give valid rating");
		 
	}
	
	public static void main(String[] args) {
		Restaurant res=new Restaurant(items, prices, ratings);
		System.out.println("***************Welcome To Hotel Sri*****************");
		boolean flag=true;
		while (flag) {
			
		
		System.out.println("1.Add dish\n2.Remove dish\n3.Ratings");
		int val=sc.nextInt();
		
		switch (val) {
		case 1:
			res.adddish();
			break;
		case 2:
			
			res.removedish();
			break;
		case 3:
			res.ratings();
		default:
			break;
		}
		System.out.println("Want to continue");
		System.out.println("1.yes\n2.no");
		int opt=sc.nextInt();
		if(opt==1) {
			flag=true;
		}
		else
			flag=false;
		}
	}

}
