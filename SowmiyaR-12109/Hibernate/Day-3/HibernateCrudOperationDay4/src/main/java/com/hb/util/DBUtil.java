package com.hb.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	public static Session opensession() {
		   Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			return session;
	}
	}

