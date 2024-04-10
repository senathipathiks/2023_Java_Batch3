package com.car.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.car.Utill.HibernateUtil;
import com.car.bean.Car;




public class carDao {

	public int insert(Car c) {
		int n = 0;
		try {
			System.out.println(c);
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			session.persist(c);
			n = 1;
			t.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	
	public List<Integer> idList()
	{
		Session session = HibernateUtil.opensession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select CarID from Car");
		List<Integer> list = query.list();
		
		transaction.commit();
		session.close();
		return list;
	}
	
	public void delete(Car bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		session.delete(bean);
		t.commit();
		session.close();
		
	}
	
public Car fetchMethod(int id){
		
		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();		
		Car temp = session.find(Car.class, id);	
		return temp;	
	}
	
	
	public void update(Car bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		session.update(bean);
		t.commit();
		session.close();
		
	}
	
	public Car viewStudent(Car bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		Car stu = session.find(Car.class, bean.getCarID());
		
		t.commit();
		session.close();
		return stu;
	}
	
	
	public List<Car> findallStudent()
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("from Car");
		List<Car> list = query.list();
		System.out.println(list);
		t.commit();
		session.close();
		return list;
	}

}
