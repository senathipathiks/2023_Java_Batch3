package com.tms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tms.bean.Admin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	EntityManager entityMan;

	@Override
	public Admin newAdmin(Admin newAdmin) {
		entityMan.persist(newAdmin);
		return newAdmin;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getAdmins() {
		return entityMan.createQuery("from Admin").getResultList();
	}

	@Override
	public Admin adminfind(int adminId) {
		return entityMan.find(Admin.class, adminId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getAdminIdList() {
		Query q = entityMan.createQuery("SELECT c.adminId FROM Admin c");
		return q.getResultList();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		entityMan.merge(admin);
		return admin;
	}

	@Override
	public Admin adminLogin(String adminName, String adminPassword) {
		Query query1 = entityMan.createQuery("from Admin u where u.adminName =?1 and u.adminPassword=?2");
		query1.setParameter(1, adminName);
		query1.setParameter(2, adminPassword);

		return (Admin) query1.getSingleResult();

	}

}
