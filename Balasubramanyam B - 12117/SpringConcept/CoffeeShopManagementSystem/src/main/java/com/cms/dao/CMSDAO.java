package com.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cms.bean.*;
import com.cms.util.*;



public class CMSDAO {
	public int insert(CoffeeShopManagementSystem c) {
		int n = 0;
		try {
			Session session = CMSUtil.opensession();
			Transaction t = session.beginTransaction();
			n = (Integer) session.save(c);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;

	}

	public List<Integer> idList(){
	    Session session = CMSUtil.opensession();
	    Transaction transaction = session.beginTransaction();
	    Query query =  session.createQuery("select id from CoffeeShopManagementSystem");
	    List<Integer> list = query.list();
	    session.close();
	    return list;
	}
	public void delete(CoffeeShopManagementSystem c) {
		Session session = CMSUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		session.delete(c);
		t.commit();
		session.close();
	}

	public void update(CoffeeShopManagementSystem c) {
		Session session = CMSUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		session.update(c);
		t.commit();
		session.close();
	}

	public CoffeeShopManagementSystem find(CoffeeShopManagementSystem c) {
		Session session = CMSUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		CoffeeShopManagementSystem c1 = session.find(CoffeeShopManagementSystem.class, c.getid());
		t.commit();
		session.close();
		return c1;
	}
	@SuppressWarnings("unchecked")
	public List<CoffeeShopManagementSystem> findall() {
		Session session = CMSUtil.opensession();
		List<CoffeeShopManagementSystem> c = session.createQuery("from CoffeeShopManagementSystem").list();
		session.close();
		return c;
	}
}


