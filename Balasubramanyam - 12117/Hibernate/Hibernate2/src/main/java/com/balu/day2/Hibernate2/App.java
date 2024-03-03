package com.balu.day2.Hibernate2;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int choice;
        boolean True = true;
        while (True) {
        	
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction t = session.beginTransaction();
            
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Find");
            System.out.println("5. Find All");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
     
            switch (choice) {
                case 1:
                	 Employee s1 = new Employee();
                	 System.out.println("Enter the name");
                	 scanner.nextLine();
                	 String name = scanner.nextLine();
                	 System.out.println("Enter the city");
                	 String city = scanner.nextLine();
                	 
                     s1.setName(name);
                     s1.setCity(city);
                     session.save(s1);
                     t.commit();
                     break;
                case 2:
                	 System.out.println("Enter the Id");
                	 int id = scanner.nextInt();
                	 Employee temp = session.find(Employee.class, id);
                	 if (temp != null) {
                		 System.out.println("Enter the new name");
                         scanner.nextLine();
                         String newName = scanner.nextLine();
                         System.out.println("Enter the new city");
                         String newCity = scanner.nextLine();
                         
                         temp.setName(newName);
                         temp.setCity(newCity);
                         session.update(temp);
                         t.commit();
                     } else {
                         System.out.println("No employee found with the given Id.");
                     }
                     break;
                case 3:
                	 System.out.println("Enter the Id");
                	 int id1 = scanner.nextInt();
                	 Employee temp1 = session.find(Employee.class, id1);
                     if (temp1 != null) {
                         session.delete(temp1);
                         t.commit();
                     } else {
                         System.out.println("No employee found with the given Id.");
                     }
                     break;
                case 4:
                	 System.out.println("Enter the Id");
                	 int id2 = scanner.nextInt();
                	 Employee temp2 = session.find(Employee.class, id2);
                     if (temp2 != null) {
                         System.out.println(temp2);
                     } else {
                         System.out.println("No employee found with the given Id.");
                     }
                     break;
                case 5:
                	List<Employee> empList = session.createQuery("from Employee").list();   //from Employee is class name
            		for (Employee e : empList) {
            			System.out.println(e);
            		}
            		System.out.println("done");
                     break;
                case 6:
                     System.out.println("Exiting...");
                     break;
                default:
                     System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Do you want to continue y/n");
            String cont = scanner.next();
            if (!cont.equalsIgnoreCase("y")) {
                True = false;
            }
        }
        scanner.close();
    }
}
//package com.balu.day2.Hibernate2;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//	public static void main(String[] args) {
//      Employee s1 = new Employee(1,"balu","chennai");
//      Employee s2 = new Employee(2,"Lokesh","Palani");
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//		 session.save(s1);
//	     session.save(s2);
//	     t.commit();
		
//      Update --------------------------------------------------------------------------
		
//      Employee s1 = new Employee();
//      Employee temp = session.find(Employee.class, 1);
//      temp.setName("Balasubramanyam");
//      temp.setCity("Tiruttani");
//      session.update(temp);
//      t.commit
		
//		Delete ---------------------------------------------------------------------------
		
//		Employee temp = session.find(Employee.class, 2);
//		session.delete(temp);
//		t.commit();
		
//		Find ------------------------------------------------------------------------------
		
//		Employee temp = session.find(Employee.class, 1);
//		System.out.println(temp);
//		t.commit();
		
//		Find All --------------------------------------------------------------------------
		
//		List<Employee> empList = session.createQuery("from Employee").list();   //from Employee is class name
//		for (Employee e : empList) {
//			System.out.println(e);
//		}
//		System.out.println("done");
	

//}}
