package com.spring.DAO;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.spring.bean.Hotel;
import com.spring.util.HibernateUtil;


public class HotelDAO {
	
public int insertHotel(Hotel htl) {
		
		int n=0;
		
		try {
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			n=(Integer)session.save(htl);
			t.commit();
			session.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return n;
	}

public List<Integer> idList(){
	
	Session session = HibernateUtil.opensession() ;
	Transaction t = session.beginTransaction();
	
	Query query = session.createQuery("select id from Hotel");
	List<Integer> list = query.list();
	
	session.close();
	return list;
	
}

public void deleteHotel(Hotel bean) {
	
	Session session = HibernateUtil.opensession();
	Transaction t = session.beginTransaction();
	
	session.delete(bean);
	t.commit();
	session.close();
}

public void updateHotel(Hotel bean) {
	
	Session session = HibernateUtil.opensession();
	Transaction t = session.beginTransaction();
	session.update(bean);
	t.commit();
	session.close();
}

public Hotel findHotel(Hotel bean) {
	
	Hotel htl = null;
	
	Session session = HibernateUtil.opensession();
	Transaction t = session.beginTransaction();
	
	Hotel temp = session.find(Hotel.class, bean.getRmid());
	htl = new Hotel();
	htl.setRmid(temp.getRmid());
	htl.setRmtype(temp.getRmtype());
	htl.setRmtariff(temp.getRmtariff());
	htl.setRmdesc(temp.getRmdesc());
	htl.setRmoccup(temp.getRmoccup());
	
	return htl;
	
	
	
	
}

public List<Hotel> findAllHotel() {
	
	Hotel htl = null;
	
	Session session = HibernateUtil.opensession();
	Transaction t = session.beginTransaction();
	
	Query query = session.createQuery("from Hotel");
	List<Hotel> list = query.list();
	t.commit();
	session.close();
	return list;
}



}
