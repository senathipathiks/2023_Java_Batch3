package com.lms.dao;

import java.util.*;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lms.bean.Laptop;
import com.lms.util.HibernateUtil;

public class LaptopDAO {
	
	private static Transaction trans;
	private static ArrayList<Laptop> listMain;
	private static ArrayList<Integer> list;
	private static final String password = "sam@6383587926";
	private static Session session = HibernateUtil.connectionSession();
	
	public boolean insertLaptop(Laptop l) {
		
		if(l != null) {
			
			trans = session.beginTransaction();
			session.save(l);
			trans.commit();
			return true;
		}
		return false;
	}
	
	public ArrayList<Integer> getKeys(){
		
		list = new ArrayList<Integer>();
		list = (ArrayList<Integer>)session.createQuery("select laptopId from Laptop").list();
		return list;
	}
	
	public boolean deleteLaptop(int id) {
		
		Laptop l = session.get(Laptop.class, id);
		if(l != null) {
			trans = session.beginTransaction();
			session.delete(l);
			trans.commit();
			return true;
		}
		return false;
	}
	
	public boolean updateLaptop(Laptop lp) {
		
		Laptop l = session.get(Laptop.class, lp.getLaptopId() );
		if(l != null) {
			l.setLaptopName(lp.getLaptopName());
			l.setProcessor(lp.getProcessor());
			l.setPrice(lp.getPrice());
			trans = session.beginTransaction();
			session.update(l);
			trans.commit();
			return true;
		}
		
		return false;
	}
	
	public Laptop searchFood(int id) {
		Laptop u = session.get(Laptop.class, id);
		return u;
	}
	
	
	public ArrayList<Laptop> viewAll(){
		listMain = new ArrayList<Laptop>();
		listMain = (ArrayList<Laptop>)session.createQuery("from Laptop").list();
		return listMain;
	}
	
	public boolean deleteAll(String pass) {
		
		if(pass.equals(password)) {
			trans = session.beginTransaction();
			Query query1 = session.createQuery("delete from Laptop");
			query1.executeUpdate();
			trans.commit();
			return true;
		}
		return false;
	}

}
