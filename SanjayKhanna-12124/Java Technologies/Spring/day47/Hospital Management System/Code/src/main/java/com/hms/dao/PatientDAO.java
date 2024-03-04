package com.hms.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.bean.Password;
import com.hms.bean.Patient;
import com.hms.util.HibernateUtil;

public class PatientDAO {
	
	private static Transaction trans;
	private static ArrayList<Patient> listMain;
	private static ArrayList<Integer> list;
	private static final String password = "sam@6383587926";
	
	public boolean insertPatient(Patient l) {
			
			if(l != null) {
				Session session = HibernateUtil.connectionSession();
				trans = session.beginTransaction();
				session.save(l);
				trans.commit();
				session.close();
				return true;
			}
			return false;
		}
	public ArrayList<Integer> getKeys(){
			Session session = HibernateUtil.connectionSession();
			list = new ArrayList<Integer>();
			list = (ArrayList<Integer>)session.createQuery("select patientId from Patient").list();
			session.close();
			return list;
		}
	
	public ArrayList<Patient> viewAll(){
		Session session = HibernateUtil.connectionSession();
		listMain = new ArrayList<Patient>();
		listMain = (ArrayList<Patient>)session.createQuery("from Patient").list();
		session.close();
		return listMain;
	}
	
public boolean deletePatient(Patient p) {
		Session session = HibernateUtil.connectionSession();
		Patient l = session.get(Patient.class, p.getPatientId());
		if(l != null) {
			trans = session.beginTransaction();
			session.delete(l);
			trans.commit();
			session.close();
			return true;
		}
		return false;
	}
	
	public boolean updatePatient(Patient lp) {
		Session session = HibernateUtil.connectionSession();
		Patient l = session.get(Patient.class, lp.getPatientId() );
		if(l != null) {
			l.setPatientName(lp.getPatientName());
			l.setPatientAge(lp.getPatientAge());
			l.setDisease(lp.getDisease());
			trans = session.beginTransaction();
			session.update(l);
			trans.commit();
			session.close();
			return true;
		}
		
		return false;
	}
	
	public Patient searchPatient(Patient ps) {
		Session session = HibernateUtil.connectionSession();
		Patient p = session.get(Patient.class, ps.getPatientId());
		session.close();
		return p;
	}
	
public boolean deleteAll(Password pass) {
		Session session = HibernateUtil.connectionSession();
		System.out.println(pass.getPassword());
		if(password.equals(pass.getPassword())) {
			trans = session.beginTransaction();
			Query query1 = session.createQuery("delete from Patient");
			query1.executeUpdate();
			trans.commit();
			session.close();
			return true;
		}
		return false;
	}
	
}
