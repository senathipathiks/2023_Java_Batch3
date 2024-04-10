package com.hotel.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hotel.bean.Hotel;
import com.hotel.util.HotelUtil;

public class HotelDao {
	
	public int insertHotel(Hotel htl) {
		
		int n=0;
		
		try {
			Session session = HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			n=(Integer)session.save(htl);
			t.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return n;
	}
	
	public Hotel findHotel(int id) {
		
		Hotel obj = new Hotel();
		
		Session session = HotelUtil.opensession();
		Transaction t = session.beginTransaction();
		Hotel temp = session.find(Hotel.class, id);
		
		obj.setId(temp.getId());
		obj.setRmtype(temp.getRmtype());
		obj.setRmtariff(temp.getRmtariff());
		obj.setRmdesc(temp.getRmdesc());
		obj.setRmoccup(temp.getRmoccup());
		
		return obj;
	
		
	}
	
	public List findallHotel(){
		
		Hotel obj = null;
		
		Session session = HotelUtil.opensession();
		Transaction t = session.beginTransaction();
		List<Hotel> htlist = session.createQuery("from Hotel").list();
	
		
		t.commit();
		return htlist;
		
	}

}
