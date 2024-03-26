package com.oss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oss.model.Administration;

public interface AdminRepository extends JpaRepository<Administration, Integer>{

	@Query("select adminId from Administration order by adminId")
	public List<Integer> getIdList();
}
