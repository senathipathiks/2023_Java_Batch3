package com.iniapro.main;

import java.util.Scanner;

import com.iniapro.bean.IniaPro;
import com.iniapro.dao.IniaProDAO;

public class IniaProMain {
	
	static Scanner sc = new Scanner (System.in);

	public static int displayMenu() {
		
		System.out.println("******Welcome to Inia Pro Help*******");
		
		
		
		System.out.println("1.Insert \n2.Delete \n3.Update \n4.Find \n5.Find All \n6.Delete All \n7.Exit");
		
		System.out.println("Enter the Option :");
		
		int choice = sc.nextInt();
		
		return choice;
		
	}
	
	
	public static IniaPro insertIssue() {
		
		System.out.println("Enter the Ticket ID , Issuer Name , Description , Assigned to and Status :");
		
		return new IniaPro(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
	}
	
	
	public static int deleteIssue() {
		
		System.out.println("Enter the Issue id");
		
		return (sc.nextInt());
	}
	
	
	public static IniaPro updateIssue() {
		
         System.out.println("Enter the Ticket ID , Issuer Name , Description , Assigned to and Status :");
		
		return new IniaPro(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
		
	}
	
	
	public static int findIssue() {
		
         System.out.println("Enter the Issue id");
		
		return (sc.nextInt());
	}
	

	public static void main(String[] args) {
		
		

		String msg =" ";
		
		int n;
		
		IniaProDAO in = new IniaProDAO();
		
		
		do {
		
	  switch (displayMenu()) {
	
	  
	  
	     case 1:
	    	 
	    	 IniaPro i = insertIssue();
	    	 
	    	 int r = in.generateConfirmationNumber();
	    	  n = in.insertIssue(i,r);
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  if(n==1) {
	    		  
	    		  System.out.println("Record Successfully Inserted !!!");
	    		  
	    	  }
	    	  else {
	    		  
	    		  System.out.println("Record Insertion Faild, Try Again !!!");
	    	  }
		
		break;
		
		
	     case 2 :
	    	 
	    	 int id = deleteIssue();
	    	 
	    	 n = in.deleteIssue(id);
	    	 
	    	 if(n==1) {
	    		  
	    		  System.out.println("Record Successfully Deleted !!!");
	    		  
	    	  }
	    	  else {
	    		  
	    		  System.out.println("Record Deletion Faild, Try Again !!!");
	    	  }
	    	 
	    	 
	    	 break;
	    
	    	 
	     case 3 :
	    	 
	    	 
	    	 IniaPro i1 = updateIssue();
	    	 
	    	  n = in.updateIssue(i1);
	    	  
                if(n==1) {
	    		  
	    		  System.out.println("Record Successfully Updated !!!");
	    		  
	    	  }
	    	  else {
	    		  
	    		  System.out.println("Record Updation Faild, Try Again !!!");
	    	  }
	    	 
	    	 
	    	 break;
	    	 
	    	 
	     case 4 :
	    	 
	    	 int id1 = findIssue();
	    	 
	    	 n = in.findIssue(id1);
	    	 

             if(n>0) {
	    		  
	    		  System.out.println("Record Successfully Finded !!!");
	    		  
	    	  }
	    	  else {
	    		  
	    		  System.out.println("Record Find is Faild, Try Again !!!");
	    	  }
	    	 
	    	break;
	    	
	     case 5:
	    	 
	    	 n = in.findAll();
	    	 
	    	 if(n>0) {
	    		  
	    		  System.out.println("Record Successfully Finded !!!");
	    		  
	    	  }
	    	  else {
	    		  
	    		  System.out.println("Record Find is Faild, Try Again !!!");
	    	  }
	    	 
	    	break;
	    	
	    	
	     case 6 :
	    	 
	    	 n =in.deleteAll();
	    	 
	    	   if(n==0) {
		    		  
		    		  System.out.println("Record Successfully Deleted !!!");
		    		  
		    	  }
		    	  else {
		    		  
		    		  System.out.println("Record Deletion Faild, Try Again !!!");
		    	  }
		    	 
		    	 
		    	 break;
		    	 
	     case 7 :
	    	 
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
