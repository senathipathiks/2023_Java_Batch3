package com.hibernate.menudriven.Menudriven_project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;


public class App {

        static Scanner sc = new Scanner(System.in); 	
        	
        	
        	public static int display() {
        		System.out.println("\nChoices: \n1.Insert Employee details \n2.Update Employee details "
        				+ "\n3.Delete Employee details \n4.Find All Employee details \n5.Exit");
        		System.out.println();
        		System.out.println("Enter the Choice: ");
        		int choice = sc.nextInt();
				return choice;
			}
        	
        
            public static void main(String[] args) {
            	String pop = " ";
            	
            	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	        	SessionFactory sf = cfg.buildSessionFactory();
	        	Session session = sf.openSession();
	        	Transaction t = session.getTransaction();
	        
	        	do {
	        		switch (display()) {
	    			case 1:
	    				Employee emp = new Employee();
	    				
	    				System.out.println("Employee Name: ");
	    				String empName =sc.next();
	    				emp.setEmpName(empName);
	    				
	    				System.out.println("Employee Department: ");
	    				String empDept =sc.next();
	    				emp.setEmpDept(empDept);
	    				
	    				System.out.println("Employee Phone number: ");
	    				int phNo =sc.nextInt();
	    				emp.setPhNo(phNo);
	    				
	    				t.begin();
	    				session.persist(emp);
	    				t.commit();				
	    				
	    				break;
	    				
	    			case 2:
	    				System.out.println("Enter the Employee ID, which is to be Update : ");
	    				int eid = sc.nextInt();
	    				
	    				System.out.println("Enter the Department to be Changed : ");
	    				String dept1  = sc.next();
	    				
	    				Employee e1 = session.find(Employee.class, eid);
	    				e1.setEmpDept(dept1);
	    				session.update(e1);
	    				t.commit();
	    				break;
	    				
	    			case 3:
	    				System.out.println("Enter the Employee ID, which is to be Delete : ");
	    				int id = sc.nextInt();
	    				
	    				Employee e2 = session.find(Employee.class, id);
	    				session.delete(e2);
	    				t.commit();
	    				
	    				break;
	    				
	    			case 4:
	    				List<Employee> empList= session.createQuery("from Employee").list();
	    		    	for(Employee p:empList) {
	    		    		System.out.println(p);
	    		    	}
	    		    	System.out.println("Done");
	    			
	    				break;
	    				
	    			case 5:
	    				System.out.println("Exited Successfully");
	    				System.exit(0);

	    				break;
	    			}
	        		
	        		System.out.println("Do you want to continue: (Yes/No) ");
				    pop = sc.next();
	        	}
	        	while(pop.equals("Yes"));    		
    		
		}    		
}
