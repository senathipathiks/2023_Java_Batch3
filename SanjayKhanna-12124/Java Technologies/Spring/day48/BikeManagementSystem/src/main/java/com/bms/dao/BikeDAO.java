package com.bms.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bms.bean.Bike;
import com.bms.bean.Password;
import com.bms.util.HibernateUtil;

import jakarta.persistence.Query;



public class BikeDAO {
	private static Transaction trans;
	private static ArrayList<Bike> listMain;
	private static ArrayList<Integer> list;
	private static final String password = "sam@6383587926";
	
	public boolean insertPatient(Bike l) {
			
			if(l != null) {
				Session session = HibernateUtil.connectionSession();
				trans = session.beginTransaction();
				session.persist(l);
				trans.commit();
				session.close();
				return true;
			}
			return false;
		}
	public ArrayList<Integer> getKeys(){
			Session session = HibernateUtil.connectionSession();
			list = new ArrayList<Integer>();
			list = (ArrayList<Integer>)session.createQuery("select bikeId from Bike").list();
			session.close();
			return list;
		}
	
	public ArrayList<Bike> viewAll(){
		Session session = HibernateUtil.connectionSession();
		listMain = new ArrayList<Bike>();
		listMain = (ArrayList<Bike>)session.createQuery("from Bike").list();
		session.close();
		return listMain;
	}
	
public boolean deletePatient(Bike p) {
		Session session = HibernateUtil.connectionSession();
		 Bike l = session.get(Bike.class, p.getBikeId());
		if(l != null) {
			trans = session.beginTransaction();
			session.remove(l);
			trans.commit();
			session.close();
			return true;
		}
		return false;
	}
	
	public boolean updatePatient(Bike lp) {
		Session session = HibernateUtil.connectionSession();
		Bike l = session.get(Bike.class, lp.getBikeId());
		if(l != null) {
			l.setBrandName(lp.getBrandName());
			l.setEngineCapacity(lp.getEngineCapacity());
			l.setMileage(lp.getMileage());
			l.setMaxSpeed(l.getMaxSpeed());
			l.setPrice(lp.getPrice());
			trans = session.beginTransaction();
			session.merge(l);
			trans.commit();
			session.close();
			return true;
		}
		
		return false;
	}
	
	public Bike searchPatient(Bike ps) {
		Session session = HibernateUtil.connectionSession();
		Bike l = session.get(Bike.class, ps.getBikeId());
		session.close();
		return l;
	}
	
public boolean deleteAll(Password pass) {
		Session session = HibernateUtil.connectionSession();
		System.out.println(pass.getPassword());
		if(password.equals(pass.getPassword())) {
			trans = session.beginTransaction();
			Query query1 = session.createQuery("delete from Bike");
			query1.executeUpdate();
			trans.commit();
			session.close();
			return true;
		}
		return false;
	}

}
