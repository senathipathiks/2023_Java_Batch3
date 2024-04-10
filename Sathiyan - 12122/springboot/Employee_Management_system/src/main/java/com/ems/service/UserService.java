package com.ems.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ems.dto.UserRegistrationDto;
import com.ems.model.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
