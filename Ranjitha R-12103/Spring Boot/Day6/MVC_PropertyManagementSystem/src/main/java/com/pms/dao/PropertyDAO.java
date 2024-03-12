package com.pms.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pms.bean.Property;
import com.pms.util.HibernateUtil;

public class PropertyDAO {
	public int insertProperty(Property prop) {
		int n = 0;
		try {
			Session session = HibernateUtil.opensession();
			Transaction transaction = session.beginTransaction();
			session.persist(prop);
			transaction.commit();
			n = 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public ArrayList<Integer> getIds() {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		Session session = HibernateUtil.opensession();
		idList = (ArrayList<Integer>) session.createQuery("select PropId from Property").list();
		Transaction transaction = session.beginTransaction();
		session.close();
		return idList;
	}

	public boolean deleteProperty(Property prop) {
		try {
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			session.delete(prop);
			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public Property getProperty(Property p) {
		try {
			Session session = HibernateUtil.opensession();
			Property prop = session.get(Property.class,p.getPropId() );
			session.close();
			return prop;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public boolean updateProperty(Property prop) {
		try {
			Session session = HibernateUtil.opensession();
			Property p=session.get(Property.class, prop.getPropId());
			
			if(p!=null) {
				Transaction t = session.beginTransaction();
				p.setPropName(prop.getPropName());
				p.setPropType(prop.getPropType());
				p.setCity(prop.getCity());
				p.setCountry(prop.getCountry());
				p.setYearOfPurchase(prop.getYearOfPurchase());
				p.setSeller(prop.getSeller());
				
				session.update(p);
				t.commit();
				session.close();
				return true;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
	
	
public ArrayList<Property> getPropertysList(){
	ArrayList<Property> list=new ArrayList<Property>();
	Session session=HibernateUtil.opensession();
	list=(ArrayList<Property>) session.createQuery("from Property").list();
	return list;
			
}
}
