package com.fullstack.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fullstack.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query("select id from Admin")
	public List<Integer> getIdList();

	@Query("select name from Admin")
	public List<String> getNameList();

}
