package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.map.bean.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
	@Query("select id from Project")
	public List<Integer> getAllProjectId();


}
