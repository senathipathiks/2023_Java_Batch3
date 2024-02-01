package com.coreDay4;

import java.util.Scanner;

public class Restaurant {
	
	int price;
	int rating;
	
	void menu() {
		System.out.println("1.Lasagyna");
		System.out.println("2.Croissant");
		System.out.println("3.Magretta");
		System.out.println("4.White Sauce Pasta");
		System.out.println("5.Ramen");
	}
	
	void quantity(int count) {
		System.out.println(count + " item preparation has been Started. Please Kindly wait.");
	}
	
	public static void main(String[] args) {
//		Write a Java program to create a class
//		called "Restaurant" with 
//		attributes for menu items, prices, and ratings, and methods to add
//		and remove items,
//		and to calculate average rating.
		
		Restaurant r = new Restaurant();
		r.menu();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an Item to Order");
		
		int num = sc.nextInt();
		
		
		
		
			switch (num) {
			case 1: {
				
				System.out.println("Lasagyna Selected.");
				break;
			}
			case 2: {
				
				System.out.println("Croissant Selected.");
				break;
			}
			case 3: {
				
				System.out.println("Magretta Selected.");
				break;
			}
			case 4: {
				
				System.out.println("White Sauce Pasta Selected.");
				break;
			}
			case 5: {
				
				System.out.println("Ramen Selected.");
				break;
			}
			
			default:
				throw new IllegalArgumentException("Select the Correct Item 1-5 " + num);
			}
			
			System.out.println("Enter the Quanity of the item : " );
			
			int count = sc.nextInt();
			
			r.quantity(count);
		}
	}


