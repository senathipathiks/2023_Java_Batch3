package com.sb.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sb.usermanagement.repository.UserRepo;

@Service
public class UserService implements UserDetailsService {

	private UserRepo repo;

	public UserService() {

	}

	@Autowired
	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		return repo.findByEmail(username).orElseThrow();
	}

}
