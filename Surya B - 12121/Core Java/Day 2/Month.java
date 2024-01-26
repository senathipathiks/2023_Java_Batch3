package com.coreDay2;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		//Months
	
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Please enter the month number (1-12): ");
		    int month = sc.nextInt();
		    int days = 0;
		    switch (month) {
		      case 1:
		      case 3:
		      case 5:
		      case 7:
		      case 8:
		      case 10:
		      case 12:
		        days = 31;
		        break;
		      case 4:
		      case 6:
		      case 9:
		      case 11:
		        days = 30;
		        break;
		      case 2:
		        System.out.print("Please enter the year: ");
		        int year = sc.nextInt();
		        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		          days = 29;
		        } else {
		          days = 28;
		        }
		        break;
		      default:
		        System.out.println("Invalid month number.");
		        break;
		    }
		    if (days != 0) {
		      System.out.println("Number of days in month " + month + " is " + days + ".");
		    }
		  }
		}

	
