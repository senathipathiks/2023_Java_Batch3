package com.crimemgt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crimemgt.dto.AdminDTO;
import com.crimemgt.entity.Admin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class AdminDAO {

	@Autowired
	EntityManager adminEntityManager;

	@SuppressWarnings("unchecked")
	public List<AdminDTO> allAdmins() {
		return adminEntityManager.createQuery("from Admin").getResultList();

	}

	public Admin adminLogin(String adminName, String adminPassword) {
		Query query1 = adminEntityManager.createQuery("from Admin a where a.adminName =?1 and a.adminPassword=?2");
		query1.setParameter(1, adminName);
		query1.setParameter(2, adminPassword);

		return (Admin) query1.getSingleResult();

	}
}
