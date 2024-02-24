package com.hibernet.day2.Day2;

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
public class App {
	public static void main(String[] args) {
		// Employee e1 = new Employee();
		// e1.setName("Ranjitha");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Employee e=new Employee();
		String msg=null;
//		session.save(e1);
//		t.commit();

		// update
//		Employee e2=session.find(Employee.class,2);
//		e2.setName("Ram");
//		session.update(e2);
//		t.commit();

		// delete
//		Employee e2=session.find(Employee.class,2);
//		session.delete(e2);
//		t.commit();

		// insert
//		t.begin();
//		Employee e3=new Employee();
//		e3.setName("Arun");
//		session.save(e3);
//		t.commit();

//		List<Employee> empList =session.createQuery("from Employee").list();
//		for(Employee e:empList) {
//			System.out.println(e);
//		}
//		System.out.println("Done");

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("==================MENU=================");
			System.out.println("1.INSERT");

			System.out.println("2. UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.Find");
			System.out.println("5.FindAll");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Employee name");
				Employee e1 = new Employee();
				String name = sc.next();
				e1.setName(name);
				session.save(e1);
				t.commit();
				System.out.println("Name inserted successfully");
				break;
			case 2:
				System.out.println("Enter the employee id to  update details");
				int eid = sc.nextInt();
				System.out.println("Enter the employee name to update");
				String name1 = sc.next();
				Employee e2 = session.find(Employee.class, eid);
				e2.setName(name1);

				session.update(e2);
				t.commit();
				t.begin();
				System.out.println("Name updated Successfully");
				break;
			case 3:
				System.out.println("Delete Employee deatils");
				int eid1 = sc.nextInt();
				Employee e3 = session.find(Employee.class, eid1);
				session.delete(e3);
				t.commit();
				break;
			case 4:
				System.out.println("Enter the Employee Id to show their details:");
				int eid3=sc.nextInt();
				Employee e4=session.find(Employee.class,eid3);
				System.out.println(e4);
				break;
			case 5:
				List<Employee> empList = session.createQuery("from Employee").list();
				for (Employee e5 : empList) {
					System.out.println(e5);
				}
				break;
			}
				System.out.println("\n");
			       System.out.println("Do you want to continue?\nyes \nno");
			        msg=sc.next();
			       
			       
			} while (msg.equals("yes"));
			       System.out.println("You have been Quitted :(");
			
	
	}

}
