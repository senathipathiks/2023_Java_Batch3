package com.employeeApp.util;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Component
public class DBUtil {

	public EntityManager getConnection() {

		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

		return em;

	}

}
