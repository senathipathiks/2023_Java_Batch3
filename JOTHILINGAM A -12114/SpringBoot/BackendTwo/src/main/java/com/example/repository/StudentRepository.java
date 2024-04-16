package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Student;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	@Query("select id from Student order by id")
	public List<Integer> getIdList();
	
	


	
	
	
	

}
