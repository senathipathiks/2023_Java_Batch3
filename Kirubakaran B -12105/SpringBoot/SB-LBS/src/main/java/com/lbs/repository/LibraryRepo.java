package com.lbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lbs.model.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer>{
   
	@Query("select lid from Library")
	public List<Integer> getIdList();
}
