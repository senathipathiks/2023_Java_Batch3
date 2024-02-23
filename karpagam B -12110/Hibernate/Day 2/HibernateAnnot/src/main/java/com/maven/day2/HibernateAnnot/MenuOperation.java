package com.maven.day2.HibernateAnnot;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MenuOperation {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session =factory.openSession();
	       Transaction t=session.beginTransaction();
		   Employee e1=new Employee();
		   String msg=null;
	       do {
			
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter your choice:");
	       System.out.println("1.Insert \n2.Delete \n3.Update \n4.Search \n5.Find All");
	       int k=sc.nextInt();

	     
	    	 switch (k) {
	     
		case 1:
			 System.out.println("Enter Employee Name:");
			 String nam=sc.next();
			 System.out.println("Enter Employee Salary:");
			 String sal=sc.next();
			 e1.setEname(nam);
	         e1.setEsal(sal);
	         session.save(e1);
	         t.commit();
	         break;
	         
		case 2:
			System.out.println("Enter Employee Id to delete:");
			int no=sc.nextInt();
			 Employee temp=session.find(Employee.class,no);
	         session.delete(temp);
	         t.commit();
	         break;

		case 3:
			System.out.println("Enter Employee Id to Update:");
			int n=sc.nextInt();
			System.out.println("Enter the Employee name to update");
			String nam1=sc.next();
			Employee temp1=session.find(Employee.class, n);
		    temp1.setEname(nam1);
	        session.update(temp1); 
	        t.commit();
	        break;

		
		case 4:
			System.out.println("Enter the Employee Id to show their details:");
			int p=sc.nextInt();
			Employee temp2=session.find(Employee.class,p);
			System.out.println(temp2);
			break;
			
		case 5: 
			List <Employee> empList=session.createQuery("from Employee").list();
        for (Employee e :empList) {
       	 System.out.println(e);
			
		}
        System.out.println("Done :)");

        break;

			
        }
	    	 System.out.println("\n");
	       System.out.println("Do you want to continue?\nyes \nno");
	        msg=sc.next();
	       
	       
	} while (msg.equals("yes"));
	       System.out.println("You have been Quitted :(");
	}

}
