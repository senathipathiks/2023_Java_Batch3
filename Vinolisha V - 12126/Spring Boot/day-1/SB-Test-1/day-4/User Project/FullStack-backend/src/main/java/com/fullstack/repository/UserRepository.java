package com.fullstack.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fullstack.model.User;


public interface UserRepository extends CrudRepository<User, Long>{

	
	@Query("select id from User")
	public List<Integer> getIdList();

	
	@Query("select name from User")
	public List<String> getNameList();


}
