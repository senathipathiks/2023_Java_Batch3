package com.fullstack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.fullstack.bean.Department;
import com.fullstack.bean.Student;

public interface StudentRepository extends JpaRepository <Student, Integer> {

	@Query("select sid from Student")
	public List<Integer> getIdList();
}
