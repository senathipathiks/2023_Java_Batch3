package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lms.model.User;
import java.util.List;
;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
