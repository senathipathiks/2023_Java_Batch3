package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtil {
	public static Session opensession() {
//		Configuration cfg=new Configuration.configure("Hibernate.cfg.xml");
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
	}

}
