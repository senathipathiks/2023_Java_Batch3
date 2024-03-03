package com.springhiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainHiber {

	public String repo(LoginPage l) {
		System.out.println("repo");
		
       Configuration con = new Configuration().configure("hibernate.cfg.xml");
 
		 
		 SessionFactory sf = con.buildSessionFactory();
		 
		 Session  s   = sf.openSession();
		 
		  Transaction t = s.getTransaction();
		  
		  t.begin();
		  
		  s.persist(l);
		   t.commit();
		
		return "Yes";
	}

}
