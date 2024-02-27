package com.maven.day2.Employee;

import java.util.List;

import org.hibernate.Criteria;
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
    	Employee s1=new Employee();
       
//        s1.setEmpname("sena");
//        s1.setEmprole("Trainer");
//        s1.setSalary(5000);
        
    	
        

      Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      
//      Employee s2=session.find(Employee.class,11);
//	  	 s2.setEmpname("Gowtham");
//	  	 session.delete(s2);
//	  	 session.update(s2);
	      
//      session.save(s1);
//      t.commit();
      
//      List<Employee> empList = session.createQuery("from Employee").list();
//      for(Employee e:empList) {
//    	  System.out.println(e);
//      }
    	  
    	Criteria criteria = session.createCriteria(Employee.class);
    	
    	List<Employee> list=criteria.list();
    	for (Object emp : list) {
			System.out.println(emp);
		}
    }
}
