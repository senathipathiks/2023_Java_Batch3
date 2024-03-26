package com.springboot.repo;

	import java.util.ArrayList;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;

    import com.springboot.bean.Department;

	

	public interface DeptRepo extends JpaRepository<Department, Integer> {
		
		@Query("select did FROM Department")
		public ArrayList<Integer> getId();

	}


