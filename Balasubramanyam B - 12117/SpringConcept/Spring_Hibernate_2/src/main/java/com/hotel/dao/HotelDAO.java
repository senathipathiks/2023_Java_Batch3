package com.hotel.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hotel.bean.Hotel;
import com.hotel.util.*;


public class HotelDAO {

	public int insertHotel(Hotel h) {
		int n = 0;
		try {
			Session session = HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			n = (Integer) session.save(h);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;

	}

	public List<Integer> idList(){
	    Session session = HotelUtil.opensession();
	    Transaction transaction = session.beginTransaction();
	    Query query =  session.createQuery("select id from Hotel");
	    List<Integer> list = query.list();
	    session.close();
	    return list;
	}
	public void deleteHotel(Hotel h) {
		Session session = HotelUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		session.delete(h);
		t.commit();
		session.close();
	}

	public void updateHotel(Hotel h) {
		Session session = HotelUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		session.update(h);
		t.commit();
		session.close();
	}

	public Hotel  findHotel(Hotel h) {
		Session session = HotelUtil.opensession();
		Transaction t = (Transaction) session.beginTransaction();
		Hotel h1 = session.find(Hotel.class, h.getId());
		t.commit();
		session.close();
		return h1;
	}
	@SuppressWarnings("unchecked")
	public List<Hotel> findallHotel() {
		Session session = HotelUtil.opensession();
		List<Hotel> stud = session.createQuery("from Hotel").list();
		session.close();
		return stud;
	}
}
