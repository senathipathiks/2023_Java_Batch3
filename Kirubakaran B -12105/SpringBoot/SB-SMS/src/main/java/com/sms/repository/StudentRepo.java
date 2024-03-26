package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sms.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select sid from Student")
	public List<Integer> getIdList();
}

