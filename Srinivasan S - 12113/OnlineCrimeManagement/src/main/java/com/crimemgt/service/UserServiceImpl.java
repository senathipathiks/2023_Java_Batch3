package com.crimemgt.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.crimemgt.dao.UserDAO;
import com.crimemgt.dto.UserDTO;
import com.crimemgt.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userdao;
	
		
	@Override
	public User regUser(User user, MultipartFile image) throws IOException {

		User userentity = new User();
		userentity.setUserName(user.getUserName());
		userentity.setUserAddress(user.getUserAddress());
		userentity.setEmail(user.getEmail());
		userentity.setUserPhn(user.getUserPhn());
		userentity.setUserAge(user.getUserAge());

		try {
			if (user.getUserPassword().equals(user.getUserconfirmPassword())) {
				userentity.setUserPassword(user.getUserPassword());
				userentity.setUserconfirmPassword(user.getUserconfirmPassword());

				userentity.setUserProof(user.getUserProof());

				userentity.setProofImg(image.getBytes());

				return userdao.regUser(userentity);

			}
		} catch (Exception e) {
			e.getMessage();
				}
		return null;
	}

	@Override
	public List<UserDTO> getUsers() {

		return userdao.getUsers();
	}

	@Override
	public User validateLogin(String userName, String userPassword) {

		return userdao.validateLogin(userName, userPassword);
	}

	@Override
	public User getUserByName(String userName) {
		 return userdao.searchUser(userName);
	}

	@Override
	public User updateUser(User user, MultipartFile image) throws IOException {

		User userentity = new User();
		userentity.setUserId(user.getUserId());
		userentity.setUserName(user.getUserName());
		userentity.setUserAddress(user.getUserAddress());
		userentity.setUserPhn(user.getUserPhn());
		userentity.setUserAge(user.getUserAge());

		try {
			if (user.getUserPassword().equals(user.getUserconfirmPassword())) {
				userentity.setUserPassword(user.getUserPassword());
				userentity.setUserconfirmPassword(user.getUserconfirmPassword());

				userentity.setUserProof(user.getUserProof());

				userentity.setProofImg(image.getBytes());

				return userdao.updateUser(userentity);

			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public boolean deleteUser(int userId) {
		return userdao.deleteVehicle(userId);
	}

}
