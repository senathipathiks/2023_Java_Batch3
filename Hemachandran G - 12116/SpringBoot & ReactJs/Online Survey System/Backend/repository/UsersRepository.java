package com.oss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oss.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
