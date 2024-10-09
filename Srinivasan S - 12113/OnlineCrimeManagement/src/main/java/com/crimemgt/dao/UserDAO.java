package com.crimemgt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crimemgt.dto.UserDTO;
import com.crimemgt.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class UserDAO {

	@Autowired
	EntityManager entityManager;

	public User regUser(User user) {
		entityManager.persist(user);
		return user;
	}

	public User updateUser(User user) {
		entityManager.merge(user);

		return user;
	}

	@SuppressWarnings("unchecked")
	public List<UserDTO> getUsers() {
		return entityManager.createQuery("from User").getResultList();
	}

	public User validateLogin(String userName, String userPassword) {
		Query query1 = entityManager.createQuery("from User u where u.userName =?1 and u.userPassword=?2");
		query1.setParameter(1, userName);
		query1.setParameter(2, userPassword);

		return (User) query1.getSingleResult();
		

	}

	public User searchUser(String userName) {
		Query qry2 = entityManager.createQuery("from User u where u.userName=?1");
		qry2.setParameter(1, userName);
		return (User) qry2.getSingleResult();
	}

	public boolean deleteVehicle(int userId) {
		User user = entityManager.find(User.class, userId);
		entityManager.remove(user);
		return true;
	}

}
