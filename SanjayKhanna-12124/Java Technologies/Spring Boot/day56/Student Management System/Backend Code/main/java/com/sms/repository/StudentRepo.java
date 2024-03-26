package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.sms.entity.Student;

@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("from Student order by stuName ")
	public List<Student> getAllStudent();
}
