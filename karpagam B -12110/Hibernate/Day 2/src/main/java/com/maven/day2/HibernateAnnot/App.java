package com.maven.day2.HibernateAnnot;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Session session =factory.openSession();
       Transaction t=session.beginTransaction();
       
       
      //****insert operation
//       Employee e1=new Employee();
//       e1.setEname("boo");
//       e1.setEsal("thousand");
//       session.save(e1);
       
       
      //****update operation
//        Employee temp=session.find(Employee.class, 1);
//        temp.setEname("kavi");
//        session.update(temp); // or we can use merge instead of update
       
      //****delete operation
//         Employee temp=session.find(Employee.class, 4);
//         session.delete(temp);
//         
      //****Find operation
       
         List <Employee> empList=session.createQuery("from Employee").list();
         for (Employee e :empList) {
        	 System.out.println(e);
			
		}
         System.out.println("Done");

       
       
       
        
        
        t.commit();
        
   
       
       
      
    }
}
