package com.springCoreMvc.dbutil;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Component
public class DBUtility {
	
	
	public EntityManager getConnection() {
		
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		return em;
		
	}

}
