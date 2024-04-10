package com.rss.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rss.bean.User;

import jakarta.transaction.Transactional;

public interface UserRepo extends CrudRepository<User, Integer> {
	
	@Transactional
	public List<User> findByUsName(String usName);
	
	@Transactional
	public void deleteByUsName(String usName);

}
