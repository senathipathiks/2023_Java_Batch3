package day2Assessment.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day2Assessment.bean.User;

public class RegistrationDAO {

	static Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
	static SessionFactory factory = con.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t = session.getTransaction();

	public static int insert(User u) {

		Integer i;
		t.begin();
		i = (Integer)session.save(u);
		t.commit();
		System.out.println(i);
		return i;

	}
	
	public static void name() {
		
	}

}
