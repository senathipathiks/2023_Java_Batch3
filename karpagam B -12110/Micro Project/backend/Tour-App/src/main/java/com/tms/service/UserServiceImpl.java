package com.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tms.bean.User;
import com.tms.repository.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public User insertUser(User newUser) {
		return userdao.insertUser(newUser);

	}

	@Override
	public User updateUser(User user) {
		return userdao.updateUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.getUsers();
	}

	@Override
	public User userfind(int userId) {
		return userdao.userfind(userId);
	}

	@Override
	public List<Integer> getUserIdlist() {
		return userdao.getUserIdlist();
	}

	@Override
	public List<User> searchUser(String userName) {
		return userdao.searchUser(userName);
	}

	@Override
	public User userLogin(String userName, String userPassword) {
		return userdao.userLogin(userName, userPassword);
	}

}
