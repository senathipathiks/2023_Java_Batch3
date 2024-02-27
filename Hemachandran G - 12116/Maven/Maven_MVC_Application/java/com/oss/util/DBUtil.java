package com.oss.util;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	
		public static Session opensession(){
			Configuration cfg = new Configuration().configure("hibernate.hbm.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			return session;
		}
	}


