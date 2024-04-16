package com.hibernate.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Student;

public class HibernateUtill {
	
	public static Session openession() {
		
		//Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		
		Configuration cfg=new Configuration().configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	
    	
    	return session;
	}
	

}
