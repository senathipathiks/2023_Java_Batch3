package com.sbmobilerepairapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbmobilerepairapp.entity.User;

@Repository
public class UserDAO {

	private UserRepo repo;

	public UserDAO() {
		super();
	}

	@Autowired
	public UserDAO(UserRepo repo) {
		super();
		this.repo = repo;
	}

	public User getUserById(int id) {
		return repo.findById(id).get();

	}

}
