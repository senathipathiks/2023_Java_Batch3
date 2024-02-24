package com.ums.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.ums.bean.User;

public class UserDAO {
	private static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	private static SessionFactory factory = cfg.buildSessionFactory();
	private static Session session = factory.openSession();
	private static Transaction trans = session.getTransaction();
	private static ArrayList<User> list;
	
	public boolean insertUser(User u) {
		
		if(u != null) {
		trans.begin();
		session.persist(u);
		trans.commit();
		return true;
		}
		return false;
	}
	
	public boolean deleteUser(int id) {
		
		User u = session.get(User.class, id);
		
		if(u != null) {
		trans.begin();
		session.delete(u);
		trans.commit();
		return true;
		}
		
		return false;
		
	}
	
	public boolean updateUser(User u) {
		User ur = session.get(User.class, u.getUserId());
		if(ur != null) {
			ur.setUsername(u.getUsername());
			ur.setPassword(u.getPassword());
			trans.begin();
			session.update(ur);
			trans.commit();
			return true;
		}
		return false;
		}
	public User searchUser(int id){
		User u = session.find(User.class, id);
		return u;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<User> viewall(){
		
		list = new ArrayList<User>();
		
//		Criteria c=session.createCriteria(User.class);  
//		
//		list =  (ArrayList<User>) c.list();
		
		list = (ArrayList<User>) session.createQuery("from User").list();
		
		return list;
	}
}
