package com.tms.service;

import java.util.List;

import com.tms.bean.User;

public interface UserService {

	public User insertUser(User newUser);

	public User updateUser(User user);

	public List<User> getUsers();

	public User userfind(int userId);

	public List<Integer> getUserIdlist();

	public List<User> searchUser(String userName);

	public User userLogin(String userName, String userPassword);

}
