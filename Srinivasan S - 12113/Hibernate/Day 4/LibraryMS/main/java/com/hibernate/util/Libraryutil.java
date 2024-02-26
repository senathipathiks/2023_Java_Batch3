package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Library;



public class Libraryutil {
	public static Session opensession() {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();
	    Session session =factory.openSession();
	    
		
		return session;
		}

	
}
