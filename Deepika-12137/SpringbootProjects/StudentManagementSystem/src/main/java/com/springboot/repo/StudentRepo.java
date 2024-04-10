package com.springboot.repo;

	import java.util.ArrayList;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;

import com.springboot.bean.Student;


	public interface StudentRepo extends JpaRepository<Student, Integer> {
		
		@Query("select sid FROM Student")
		public ArrayList<Integer> getId();

	}


