package com.lbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lbs.model.User;
import java.util.List;
;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
