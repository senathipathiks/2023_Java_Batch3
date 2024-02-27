package com.user_details.main;
import java.util.*;
import java.Customer.dao;

import com.user_details.bean.Customer;
public class user_detailsMain {
	



	    static Scanner sc=new Scanner(System.in);
	    
	    public static int displaymenu() {
	        System.out.println("1.Insert  2.Delete  3.Update  4.Find  5.Findall  6.Exit");
	        System.out.println("Enter your choice");
	        int choice=sc.nextInt();
	        return choice;
	    }
	    
	    public static Customer insertEmployee() {
	        System.out.println("Enter the User id and User name");
	        return new Customer(sc.nextInt(),sc.next());
	    }
	    
	    public static int deleteEmployee() {
	        System.out.println("Enter the Employee ID to Delete");
	        return (sc.nextInt());
	    }
	    
	    public static Customer updateEmployee() {
	        System.out.println("Enter the User id and User name");
	        return new Customer(sc.nextInt(),sc.next());
	    }
	    
	    public static int findEmployee() {
	        System.out.println("Enter the Employee ID to Find");
	        return (sc.nextInt());
	    }
	    
	    public static void main(String[] args) {
	        boolean decision=true;
	        String msg=" ";
	        int n;
	      user_detailsDAO dao=new user_detailsDAO();
	        do {
	            switch(displaymenu()) {
	            case 1:
	                Customer emp1=insertEmployee();
	                n=dao.insertEmployee(emp1);
	                if (n==1) 
	                    System.out.println("Record Inserted Successfully");
	                else 
	                    System.out.println("Record Insertion Failed");
	                decision=false;
	                break;
	                
	            case 2: 
	                int id=deleteEmployee();
	                n=dao.deleteEmployee(id);
	                if (n==1) 
	                    System.out.println("Record Deletion Successfully");
	                else 
	                    System.out.println("Record Deletion Failed");
	                decision=false;
	                break;
	                
	            case 3: 
	                Customer emp2=(Customer) updateEmployee();
	                n=dao.updateEmployee(emp2);
	                if (n==1) 
	                    System.out.println("Record Updation Successfully");
	                else 
	                    System.out.println("Record Updation Failed");
	                decision=false;
	                break;
	                
	            case 4: 
	                int emp3=findEmployee();
	                n=dao.findEmployee(emp3);
	                if (n==1) 
	                    System.out.println("Record Found Successfully");
	                else 
	                    System.out.println("Record Finding Failed");
	                decision=false;
	                break;
	            
	            case 6:
	                System.out.println("Thank you...");
	                decision=false;
	                
	            }
	        }while(decision);
	    }

	}
