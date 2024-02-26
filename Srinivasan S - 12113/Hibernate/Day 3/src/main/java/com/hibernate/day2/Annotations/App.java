package com.hibernate.day2.Annotations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Session session= factory.openSession();
       Transaction t=session.beginTransaction();
       
       Employee e1=new Employee();
       
       //insert data
//       e1.seteName("Surya");
//       e1.seteDesig("Devops");
 //      session.persist(e1);
       
//       //update data
//       Employee temp=session.find(Employee.class, 2);
//       temp.seteDesig("Support");
//       session.merge(temp);
       
       //delete data
//       Employee temp=session.find(Employee.class, 5);
//       session.remove(temp);
       
       
//       List<Employee>list=session.createQuery("from Employee").list();
//       for (Employee employee : list) {
//		System.out.println(employee);
//	}
//       System.out.println("Donee");
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome To Sri group of Industries");
       int msg=0;

       do {
		
    	          System.out.println("Choose your menu");
       System.out.println("1.Insert\n2.Update\n3.FindAll\n4.Delete\n5.Find");
       int option=sc.nextInt();
       
       switch (option) {
	case 1:
		
		System.out.println("Enter Employee name ");
		String name=sc.next();
		
		System.out.println("Enter Employee designation");
		String des=sc.next();
		
		e1.seteName(name);
		e1.seteDesig(des);
		session.persist(e1);
		
		t.commit();
		break;
		
	case 2:
		
		System.out.println("Enter Employee id");
		int uid=sc.nextInt(); 
		
		System.out.println("Enter Employee name ");
		String uname=sc.next();
		
		System.out.println("Enter Employee designation");
		String udes=sc.next();
		
		Employee temp=session.find(Employee.class,uid);
		temp.seteName(uname);
		temp.seteDesig(udes);
		
		t.commit();
		break;
		
	case 3:
		List<Employee>list=session.createQuery("from Employee").list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		break;
	
	case 4:
		System.out.println("Enter Employee id");
		int did=sc.nextInt(); 
		
		Employee tempp=session.find(Employee.class, did);
		session.remove(tempp);
		t.commit();
		break;
		
	
	case 5:
		System.out.println("Enter Employee id");
		int fid=sc.nextInt();
		
		Employee tempfind=session.find(Employee.class, fid);
		System.out.println(tempfind);
		
	default:
		break;
	}
       System.out.println("Want to continue");
		System.out.println("1.Yes\n2.No");
		 msg=sc.nextInt();
       
    
    } while (msg==1);
       System.out.println("Thank you !");
    }
}
