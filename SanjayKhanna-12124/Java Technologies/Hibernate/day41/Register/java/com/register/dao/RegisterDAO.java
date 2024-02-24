package com.register.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.register.bean.Registration;



public class RegisterDAO {
	
	private static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	private static SessionFactory factory = cfg.buildSessionFactory();
	private static Session session = factory.openSession();
	private static Transaction trans = session.getTransaction();
	
	public boolean insert(Registration s) {
		if(s!=null) {
			trans.begin();
			session.save(s);
			trans.commit();
			return true;
		}
		return false;
	}


}
