package com.crimemgt.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.crimemgt.dto.UserDTO;
import com.crimemgt.entity.User;

public interface UserService {

	public User regUser(User user, MultipartFile file) throws IOException;

	public List<UserDTO> getUsers();

	public User validateLogin(String userName, String userPassword);

	public User getUserByName(String userName);

	public User updateUser(User user, MultipartFile image) throws IOException;
	
	public boolean deleteUser(int userId);

}
