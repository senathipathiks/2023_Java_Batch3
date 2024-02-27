package com.hib.main.HibernateCRUD;

import java.util.ArrayList;
import java.util.Scanner;

import com.hib.DAO.UserClassDAO;
import com.hib.bean.UserClass;

public class UserMain {

	private static UserClassDAO dao = new UserClassDAO();
	
	
	public static void main(String[] args) {
		boolean dec=true;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Add\n2.Delete\n3.Update\n 4.Find \n5.Find All \n6.Quit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();			
		switch(choice) {
		case 1:{
			  System.out.println("Enter user id");
			  int u1=sc.nextInt();
			  System.out.println("Enter user name");
			  String u2=sc.next();
			  System.out.println("Enter user city");
			  String u3=sc.next();
			
			  UserClass u = new UserClass(u1, u2, u3);
			 int n1=dao.insertUser(u);
			 if(n1==1) {
				 System.out.println("Inserted sucessfully");
			 }
			 else {
				 System.out.println("Insertion failure");
			 }
			 break;
		}
		case 2:{
			 System.out.println("Enter user id to delete");
			  int u11=sc.nextInt();
			  int n11=dao.deleteUser(u11);
			  if(n11==1) {
					 System.out.println("deleted sucessfully");
				 }
				 else {
					 System.out.println("deletion failure");
				 }
				 break;
			  
		}
		case 3:{
			 System.out.println("Enter user id ");
			  int u21=sc.nextInt();
			  System.out.println("Enter user name to update");
			  String u22=sc.next();
			  System.out.println("Enter user city to update");
			  String u23=sc.next();
			
			  UserClass u211= new UserClass(u21, u22, u23);
			 int n111=dao.UpdateUser(u211);
			 if(n111==1) {
				 System.out.println("updated sucessfully");
			 }
			 else {
				 System.out.println("updation failure");
			 }
			 break;
		}
		case 4:{
			System.out.println("Enter user id to search");
			 int u11=sc.nextInt();
			  UserClass n11=dao.searchUser(u11);
			  if(n11!=null) {
					 System.out.println("search sucessfully");
					 System.out.println(n11.toString());
				 }
				 else {
					 System.out.println("search failure");
				 }
				 break;
		}
		case 5:{
			ArrayList<UserClass> u=dao.findAll();
			if(u==null) {
    			System.out.println("No record found");
    		}
    		else {
    			System.out.println("Total no of Record : "+u.size());
    			
    				System.out.println(u.toString());
    		}
    		break;
		}
		case 6:{
    		System.out.println("Are you Confirm?[y/n]");
    		String ch = sc.next();
    		if(ch.charAt(0)=='y')
    			dec = false;
    		else
    			System.out.println("Quitting process failure");
    		break;
    	}
    	default: System.out.println("Invalid Option \nPlease enter only 1-6");
    	}
    	
    	System.out.println("-------------------------------------------------\n");
    	
    }while(dec);
		}
	
		
	}
	

