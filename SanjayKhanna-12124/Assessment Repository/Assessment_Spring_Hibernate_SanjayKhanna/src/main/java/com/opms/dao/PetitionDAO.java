package com.opms.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opms.bean.Petition;
import com.opms.util.HibernateUtil;


public class PetitionDAO {
	
	
	public ArrayList<Integer> getIdList(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Session session = HibernateUtil.getSession();
		list = (ArrayList<Integer>) session.createQuery("select petitionId from Petition").list();
		session.close();
		return list;
	}
	
	public boolean insertPetition(Petition v) {
		
		boolean flag=false;
		
		try {
			Session session = HibernateUtil.getSession();
			Transaction tran = session.beginTransaction();
			session.persist(v);
			tran.commit();
			session.close();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean updatePetition(Petition v) {
		boolean flag=false;
		try {
			Session session = HibernateUtil.getSession();
			Petition p = session.get(Petition.class, v.getPetitionId());
			if(p != null) {
				p.setCategory(v.getCategory());
				p.setDescription(v.getDescription());;
				p.setPriority(v.getPriority());
				p.setRaisedBy(v.getRaisedBy());
				p.setAssignedTo(v.getAssignedTo());
				p.setStatus(v.getStatus());
				Transaction tran = session.beginTransaction();
				session.update(p);
				tran.commit();
				flag=true;
				session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public Petition getPetition(Petition v) {
		try {
			Session session = HibernateUtil.getSession();
			Petition p = session.get(Petition.class, v.getPetitionId());
			session.close();
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Boolean deletePetition(Petition v) {
		boolean flag = false;
		
		try {
			Session session = HibernateUtil.getSession();
			Petition p = session.get(Petition.class, v.getPetitionId());
			if(p != null) {
			Transaction tran = session.beginTransaction();
			session.delete(p);
			tran.commit();
			flag= true;
			session.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public ArrayList<Petition> getPetitionList(){
		ArrayList<Petition> list = new ArrayList<Petition>();
		Session session = HibernateUtil.getSession();
		list = (ArrayList<Petition>) session.createQuery("from Petition").list();
		session.close();
		return list;
	}

}
