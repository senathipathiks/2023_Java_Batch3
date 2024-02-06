package com.nanba.main;

import java.util.Scanner;


import com.nanba.bean.Nanba;
import com.nanba.dao.NanbaDAO;

public class NanbaMain {

	static Scanner sc = new Scanner (System.in);

	public static int displayMenu() {
		
		System.out.println("******Welcome to Nanba Portal Help*******");
		
		
		
		System.out.println("1.Insert \n2.Delete \n3.Update \n4.Find \n5.Find All \n6.Delete All \n7.Exit");
		
		System.out.println("Enter the Option :");
		
		int choice = sc.nextInt();
		
		return choice;
		
	}
	
	
	public static Nanba insertIssue() {
		
        System.out.println("Enter the Ticket ID , Category , Subject, Description,Priority, Raised_By, Assigned to and Status :");
		
		return new Nanba(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
		
	}
	
	
   public static int deleteIssue() {
		
		System.out.println("Enter the Ticket id :");
		
		return (sc.nextInt());
	}
	
    public static Nanba updateIssue() {
		
       System.out.println("Enter the Exisiting Ticket ID , Category , Subject, Description,Priority, Raised_By, Assigned to and Status :");
		
		return new Nanba(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
		
		
	}
    
   public static int  findIssue() {
		
		System.out.println("Enter the Search Ticket id :");
		
		return (sc.nextInt());
	}

    
	
	public static void main(String[] args) {
		
         String msg =" ";
		
		 int n;
		
		 NanbaDAO nb = new NanbaDAO();
		 
		 
		do {
			
			switch (displayMenu()) {
			case 1:
				
				
				Nanba i = insertIssue();
		    	
		    	  n = nb.insertIssue(i);
		    	  
		    	   
		    	  if(n==1) {
		    		  
		    		  System.out.println("Record Successfully Inserted !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Insertion Faild, Try Again !!!");
		    	  }
				
				break;
				
		
			case 2 :
				
				int id = deleteIssue();
		    	 
		    	 n = nb.deleteIssue(id);
		    	 
		    	 if(n==1) {
		    		  
		    		  System.out.println("Record Successfully Deleted !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Deletion Faild, Try Again !!!");
		    	  }
				
				
				break;
				
			case 3:
				

				Nanba i2 = updateIssue();
		    	
		    	  n = nb.updateIssue(i2);
		    	  
		    	   
		    	  if(n==1) {
		    		  
		    		  System.out.println("Record Successfully Updated !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Updation Faild, Try Again !!!");
		    	  }
				
				break;
				
				
			case 4:
				
				 int i3 = findIssue();
		    	 
		    	 n = nb.findIssue(i3);
		    	 

	             if(n>0) {
		    		  
	            	  
		    		  System.out.println("Record Successfully Finded !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Find is Faild, Try Again !!!");
		    	  }
				
				break;
				
			case 5 :
				
				n= nb.findAll();
				
				 if(n>0) {
		    		  
		    		  System.out.println("Record Successfully Finded !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Find is Faild, Try Again !!!");
		    	  }
				 
				 break;
				 
			case 6 :
				
				boolean n1 =nb.deleteAll();
		    	
		    	   if(n1==false) {
			    		  
			    		  System.out.println("All Record Successfully Deleted !!!");
			    		  
			    	  }
			    	  else {
			    		  
			    		  System.out.println("Record Deletion Faild, Try Again !!!");
			    	  }
			    	 
			    	 
			    	 break;
			    	 
			case 7:
				
				System.out.println("***********Thank You for Using this App*************");
				System.exit(0);
				
				
				break;

			default:
				break;
			}
			
			System.out.println("If you wish to continue the App yes or no ?");
			  
			  msg = sc.next();
			
			
		}while(msg.equals("yes")|| msg.equals("Yes"));
		
	}
}
