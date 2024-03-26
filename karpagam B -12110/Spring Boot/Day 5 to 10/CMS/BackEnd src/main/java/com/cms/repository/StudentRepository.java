package com.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cms.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
    List<Student> findByStudentName(String studentName);
	
	@Query("select studentId from Student")
	public List<Integer> getAllStudentId();

}
