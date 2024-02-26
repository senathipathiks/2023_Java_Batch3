package Annotation.Employee;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SwitchCase {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Employee e1=new Employee();
		boolean dec=true;
		while(dec) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice: "
				+ "1.Insert "
				+ "2.Delete"
				+ "3.Update"
				+ "4.Findall"
				+ "5.Quit");
		
		int n=sc.nextInt();
		switch(n) {
		case 1:{
			System.out.println("Enter Employee Name:");
			 String nam=sc.next();
			 System.out.println("Enter Employee Salary:");
			 String sal=sc.next();
			 e1.setEname(nam);
	         e1.setEsal(sal);
	         session.save(e1);
	         t.commit();
	         break;
	       }
		case 2:{
			System.out.println("Enter Employee Id to delete:");
			int no=sc.nextInt();
			 Employee temp=session.find(Employee.class,no);
	         session.delete(temp);
	         t.commit();
	         break;
		}
		case 3:{
			System.out.println("Enter Employee Id to Update:");
			int no=sc.nextInt();
			Employee temp=session.find(Employee.class,no);
			System.out.println("Enter Employee Name:");
			 String nam=sc.next();
			 System.out.println("Enter Employee Salary:");
			 String sal=sc.next();
			 temp.setEname(nam);
	         temp.setEsal(sal);
	        
	         session.update(temp);
	     
	         t.commit();
	         break;
	         
		}
		case 4:{
			List<Employee> empList=session.createQuery("from Employee").list();
	    	for(Employee e:empList) {
	    		System.out.println(e);
	    	}
	    	System.out.println("Done");
		}
		case 5:{
			System.out.println("Quit");
			break;
		}
		}
		
		System.out.println("If you want to continue y/n");
		String tem=sc.next();
		if(tem.equals("n")) {
			dec=false;
		}
		
		}
		System.out.println("Thank you !");
		
	}
	

	
		
	}


