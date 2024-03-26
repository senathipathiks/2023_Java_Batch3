package com.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
