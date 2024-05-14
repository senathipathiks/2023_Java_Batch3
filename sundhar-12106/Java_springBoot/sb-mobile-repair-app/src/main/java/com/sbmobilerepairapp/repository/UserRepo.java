package com.sbmobilerepairapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbmobilerepairapp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
