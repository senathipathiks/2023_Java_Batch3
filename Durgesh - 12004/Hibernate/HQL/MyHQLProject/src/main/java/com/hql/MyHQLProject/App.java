package com.hql.MyHQLProject;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;


public class App {
	
	static Scanner sc = new Scanner(System.in);
	
    @SuppressWarnings("rawtypes")
	public static void main( String[] args ){
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Random r = new Random(); //Generate a random number
    	
    	
//    	for (int i = 1; i <= 30; i++) {
//			Doctor d = new Doctor();
//			d.setdName("Name "+i);
//			d.setDept(r.nextInt());
//			s.persist(d);
//		}
//    	
//    	
//    	//List all the data
//    	
//    	Query q = s.createQuery("From Doctor");
//    	List<Doctor>doc = q.getResultList();
//    	for (Doctor doctor : doc) {
//			System.out.println(doctor);
//		}
    	
//    	Query qu = s.createQuery("select dId, dName, dept from Doctor where dId=5");
//    	@SuppressWarnings("rawtypes")
//		Doctor doc = (Doctor) ((org.hibernate.query.Query) qu).uniqueResult();
//    	System.out.println(doc);
    	
    	//Select Query

//    	Query q1 = s.createQuery("select dId, dName, dept from Doctor where dId=5");
//    	Object[] docObjects = (Object[]) ((org.hibernate.query.Query) q1).uniqueResult();
//    	System.out.println(docObjects[1] + " : " + docObjects[2]);
//    	
    	//Select with where clause
    	
    	
//    	Query q2 = s.createQuery("select dId, dName, dept from Doctor where dId > 1 ");
//    	List<Object[]> ls = q2.getResultList();
//    	System.out.println(ls.size());
//    	
//    	for (Object[] ob : ls) {
//			System.out.println(ob[1]);
//		}
    	
//    	Query q3 = s.createQuery("select count(dId) from Doctor ");
//    	List doList = (List) q3.getResultList();
//    	System.out.println(doList);
    	
//    	Query q5 = s.createQuery("select sum(dId) from Doctor ");
//    	Long doList = (Long) ((org.hibernate.query.Query) q5).uniqueResult();
//    	System.out.println(doList);
    	
//    	Query q4 = s.createQuery("select avg(dId) from Doctor ");
//    	double doList = (double) ((org.hibernate.query.Query) q4).uniqueResult();
//    	System.out.println(doList);
    	
//    	Query q6 = s.createQuery("update Doctor set dName=:n where dId=:i");
//    	q6.setParameter("n", "Durgesh");
//    	q6.setParameter("i", 1);
//    	int a = q6.executeUpdate();
//    	if(a>0)
//    		System.out.println("Updated Successfully");
//    	else
//    		System.out.println("Not Updated");
    	
    	Criteria cr = s.createCriteria(Doctor.class);
    	
//    	List<Doctor> l = cr.list();
//    	for (Doctor doctor : l) {
//			System.out.println(doctor);
//		}
    	
    	
//    	cr.addOrder(Order.desc("dId"));
//    	List<Doctor> l = cr.list();
//    	for (Doctor doctor : l) {
//			System.out.println(doctor);
//		}
    	
//    	cr.setFirstResult(10);
//    	cr.setMaxResults(20);
//    	List<Doctor> list = cr.list();
//    	for (Doctor doctor : list) {
//			System.out.println(doctor);
//		}
    	
//    	cr.setProjection(Projections.property("dName"));
//    	List l = cr.list();
//    	for (Object doctor : l) {
//			System.out.println(doctor);
//		}
    	
    	TypedQuery query = s.getNamedQuery("findDoctorById");
    	query.setParameter("id", 1);
    	List<Doctor> doc = query.getResultList();
    	
    	Iterator<Doctor> itr = doc.iterator();
    	while (itr.hasNext()) {
			Doctor d = (Doctor) itr.next();
			System.out.println(d);
		}
    	
    	t.commit();

    }
}
