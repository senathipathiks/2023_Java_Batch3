package com.bms.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bms.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select accountNumber FROM User")
	public ArrayList<Integer> getId();

}
