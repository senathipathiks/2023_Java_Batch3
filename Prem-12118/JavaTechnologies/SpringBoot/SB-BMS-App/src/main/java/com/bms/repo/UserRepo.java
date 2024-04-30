package com.bms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.bms.bean.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	 @Query("SELECT userId FROM User ORDER BY userId")
	    List<Integer> findAllId();
	}
