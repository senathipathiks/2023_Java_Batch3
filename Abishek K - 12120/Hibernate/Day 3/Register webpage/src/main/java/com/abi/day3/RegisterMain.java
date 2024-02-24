package com.abi.day3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterMain {

	public static int register(Register obj) {
		
		Configuration cfg = new Configuration().configure("hibernate.hbm.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	int num = (Integer) session.save(obj);
    	t.commit();
    	
    	return num;
    	
		

	}

}
