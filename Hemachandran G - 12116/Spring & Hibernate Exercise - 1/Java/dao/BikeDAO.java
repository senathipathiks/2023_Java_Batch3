package com.bms.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bms.bean.Bike;
import com.bms.util.HibernateUtil;


public class BikeDAO {
	
	private Session session = HibernateUtil.opensession();
	
	public int insert(Bike bk) {
		int n = 0;
		Transaction t = session.beginTransaction();
	    n=(Integer) session.save(bk);
		t.commit();
 
		return n;
	}

}
