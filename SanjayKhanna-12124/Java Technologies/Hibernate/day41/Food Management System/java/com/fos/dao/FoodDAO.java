package com.fos.dao;

import java.util.ArrayList;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fos.bean.Food;
import com.fos.util.HibernateUtil;

public class FoodDAO {
	private static Transaction trans;
	private static ArrayList<Food> ls;
	private static final String password = "sam@6383587926";
	
	public boolean insertfood(Food f) {
		
		if(f != null) {
		Session session = HibernateUtil.opensession();
		trans = session.beginTransaction();
		session.save(f);
		trans.commit();
		session.close();
		return true;
		}
		return false;
	}
	
	public boolean updateFood(Food f) {
		
		Session session = HibernateUtil.opensession();
		Food fd = session.get(Food.class, f.getFoodId());
		if(fd != null) {
			fd.setFoodName(f.getFoodName());
			fd.setPrice(f.getPrice());
			trans = session.beginTransaction();
			session.update(fd);
			trans.commit();
			session.close();
			return true;	
		}
		return false;
	}
	
	public boolean deleteFood(int id) {
		Session session = HibernateUtil.opensession();
		Food fd = session.get(Food.class, id);
		if(fd != null) {
			trans = session.beginTransaction();
			session.delete(fd);
			trans.commit();
			session.close();
			return true;	
		}
		return false;
	}
	
	public Food searchFood(int id) {
		Session session = HibernateUtil.opensession();
		return session.get(Food.class, id);
	}
	
	
	public ArrayList<Food> viewAll(){
		ls = new ArrayList<Food>();
		Session session = HibernateUtil.opensession();
		ls = (ArrayList<Food>)session.createQuery("from Food").list();
		session.close();
		return ls;
	}
	
	public boolean deleteAll(String pass) {
		
		Session session = HibernateUtil.opensession();
		
		if(pass.equals(password)) {
			trans = session.beginTransaction();
			Query query = session.createQuery("delete from Food");
			query.executeUpdate();
			trans.commit();
			session.close();
			return true;
		}
		return false;
	}

}
