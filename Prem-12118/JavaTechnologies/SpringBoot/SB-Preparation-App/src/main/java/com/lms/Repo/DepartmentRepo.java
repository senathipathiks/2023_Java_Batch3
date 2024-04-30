package com.lms.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lms.bean.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {

	@Query("select departmentId from Department order by departmentId")
	public List<Integer>getIdList();
}
