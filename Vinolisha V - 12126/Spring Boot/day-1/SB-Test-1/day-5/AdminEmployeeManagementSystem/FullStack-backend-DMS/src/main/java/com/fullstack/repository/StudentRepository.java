package com.fullstack.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fullstack.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select id from Student")
	public List<Integer> getIdList();

	@Query("select name from Student")
	public List<String> getNameList();
}
