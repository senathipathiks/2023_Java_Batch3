package com.sampleofsat.mavenday1;

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

	public static void main(String[] args) {
		   
//	  Students s1=new Students(10,"Steve","Spain");
	  Employee e = new Employee(121,"Sanjay",23,"Chennai");
	  Employee e1 = new Employee(123,"Heram",23,"Chennai");
	  Employee e2 = new Employee(122,"Appu",10,"Trichi");
      Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.getTransaction();
      t.begin();
//      session.update(e);
      session.save(e1);
      session.save(e2);
//      Class<Employee> Emp = null;
//	session.find(Emp,123);
//	Emp.toString();	
      t.commit();
	}
}
