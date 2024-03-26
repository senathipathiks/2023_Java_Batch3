package com.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Integer> {

}
