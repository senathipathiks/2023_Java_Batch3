package com.cms.main;

import java.util.*;
import com.cms.dao.*;
import com.cms.bean.Cms;
public class CmsMain {

	static Scanner sc=new Scanner(System.in);
	
	public static int displaymenu()
	{
		System.out.println("1.insert 2.delete 3.update 4.find 5.findall");
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		return ch;
	}
	
	public static Cms insertEmployee() 
	    {
		System.out.println("Add EmpID, EmpName & Role :");
		return new Cms(sc.nextInt(),sc.next(),sc.next());
		}	
	
	public static int deleteEmployee() {
		System.out.println("Enter EmpID you want remove");
		return (sc.nextInt());
	}
	
	public static Cms updateEmployee() {
		System.out.println("Enter EmpId and EmpName to update");
		return new Cms(sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int findEmployee() {
		System.out.println("Enter the EmpId to view");
		return (sc.nextInt());
	}
	
	public static void findAll() {
		System.out.println("Employee Listing");
	}
	
	 public static void main(String[] args) {
	        boolean decision=true;
	        String msg=" ";
	        int n;
	        CmsDao dao=new CmsDao();
	        do {
	            switch(displaymenu()) {
	            case 1:
	                Cms emp1=insertEmployee();
	                n=dao.insertEmp(emp1);
	                if (n==1) 
	                    System.out.println("Record Inserted Successfully");
	                else 
	                    System.out.println("Record Insertion Failed");
//	                decision=false;
	                break;
	                
	            case 2: 
	                int id=deleteEmployee();
	                n=dao.deleteEmp(id);
	                if (n==1) 
	                    System.out.println("Record Deletion Successfully");
	                else 
	                    System.out.println("Record Deletion Failed");
//	                decision=false;
	                break;
	                
	            case 3: 
	                Cms emp2=(Cms) updateEmployee();
	                n=dao.updateEmp(emp2);
	                if (n==1) 
	                    System.out.println("Record Updation Successfully");
	                else 
	                    System.out.println("Record Updation Failed");
//	                decision=false;
	                break;
	                
	            case 4: 
	                int emp3=findEmployee();
	                n=dao.findEmp(emp3);
	                if (n==1) 
	                    System.out.println("Record Found Successfully");
	                else 
	                    System.out.println("Record Finding Failed");
//	                decision=false;
	                break;
	                
	            case 5:
	            	findAll();
	            	dao.findAll();
	            	break;
	            	
	            		
	            
	            case 6:
	                System.out.println("Thank you...");
	                decision=false;
	                
	            }
	        }while(decision);
	    }

	}

