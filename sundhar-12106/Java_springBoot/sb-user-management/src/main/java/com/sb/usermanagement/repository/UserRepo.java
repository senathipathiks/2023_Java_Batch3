package com.sb.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.usermanagement.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
	
	Optional<Users> findByEmail(String email);

}
