package com.oss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.cj.xdevapi.DbDoc;
import com.oss.bean.OnlineShopping;
import com.oss.util.DBUtil;

public class OSDAO {
	
	int n=0;


	public int insertProduct(OnlineShopping os) {
		try {
			
			Session session=DBUtil.opensession();
			Transaction t = session.beginTransaction();
			n = (Integer)session.save(os);
			t.commit();
			
			}
		catch (Exception e) {
				System.out.println(e);;
			}
		return n;
	}

	public OnlineShopping deleteProduct(int id) {
		
		OnlineShopping temp = null;
		
		Session session = DBUtil.opensession();
		Transaction t = session.beginTransaction();
		
		temp = session.find(OnlineShopping.class, id);
		session.delete(temp);
		t.commit();
		
		return temp;
	}

	public OnlineShopping searchProduct(int id) {
		
		OnlineShopping osh = null;
		Session session = DBUtil.opensession();
		Transaction t = session.beginTransaction();
		OnlineShopping temp = session.find(OnlineShopping.class, id);
		osh = new OnlineShopping();
		osh.setProductId(temp.getProductId());
		osh.setProductName(temp.getProductName());
		osh.setQuantity(temp.getQuantity());
		osh.setPrice(temp.getPrice());
		
		return osh;
	}
	public int updateProduct(OnlineShopping os) {
		
		int n = 0;
		Session session = DBUtil.opensession();
		Transaction t = session.beginTransaction();
		OnlineShopping temp = session.find(OnlineShopping.class,os.getProductId());
		
		temp.getProductId();
		temp.getProductName();
		temp.getQuantity();
		temp.getPrice();
		
		n=(Integer)session.save(temp);
		
		
		return n;
		
	}

	public List viewAll() {
		
		OnlineShopping os = null;
		
		Session session = DBUtil.opensession();
		Transaction t = session.beginTransaction();
		List<OnlineShopping> oslist = session.createQuery("from shop").list();
	
		
		
		return null;
	}



}
