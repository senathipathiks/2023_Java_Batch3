package com.hotel.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HotelUtil {

	public static Session opensession() {
		Configuration cfg = new Configuration().configure("hibernate.hbm.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
}
