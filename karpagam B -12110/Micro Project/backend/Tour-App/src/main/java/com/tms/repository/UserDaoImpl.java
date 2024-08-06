package com.tms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tms.bean.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	EntityManager entityMan;

	@Override
	public User insertUser(User newUser) {
		entityMan.merge(newUser);
		return newUser;
	}

	@Override
	public User updateUser(User user) {
		entityMan.merge(user);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		return entityMan.createQuery("from User").getResultList();

	}

	@Override
	public User userfind(int userId) {
		return entityMan.find(User.class, userId);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getUserIdlist() {
		Query q = entityMan.createQuery("SELECT c.userId FROM User c");
		return q.getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<User> searchUser(String userName) {
		Query qry2 = entityMan.createQuery("from User u where u.userName=?1");
		qry2.setParameter(1, userName);
		return qry2.getResultList();
	}

	public User userLogin(String userName, String userPassword) {
		Query query1 = entityMan.createQuery("from User u where u.userName =?1 and u.userPassword=?2");
		query1.setParameter(1, userName);
		query1.setParameter(2, userPassword);

		return (User) query1.getSingleResult();

	}

}
