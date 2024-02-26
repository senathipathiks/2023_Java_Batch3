package com.day3.HibernateWeb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegistrationMain {

	public static int register(Registration obj) {
		
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	int i=(Integer)session.save(obj);
	
	t.commit();
		return i;
		
		
	}

}
