package com.pet.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.pet.bean.Petition;
import com.pet.util.HibeUtil;

public class PetDao {
	
	public int insertPetition(Petition pet) {
		
		int n=0;
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		n= (int) session.save(pet);
		t.commit();
		session.close();
		return n;
		
	}

	public List<Integer> idList() {
	
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select petid from Petition");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
	}
	
      public Petition fetchMethod(int id){
		
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		Petition temp = session.find(Petition.class,id);
	
		
		return temp;
	
	}

	public void updatePetition(Petition pet) {
		
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(pet);
		t.commit();
		session.close();
		
	}

	public void deletePetition(Petition emp) {
		
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(emp);
		t.commit();
		session.close();
		
	}

	public List<Petition> findallPetition() {
		
		Session session = HibeUtil.openSession();
		Transaction t = session.beginTransaction();
		List<Petition> list = new ArrayList();
		Query query = session.createQuery("from Petition");
		list = query.list();
		
		t.commit();
		session.close();
		return list;
	}

}
