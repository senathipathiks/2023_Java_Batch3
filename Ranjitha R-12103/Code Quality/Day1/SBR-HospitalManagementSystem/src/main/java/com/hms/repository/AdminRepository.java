package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.bean.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	@Query("select aid from Admin order by aid asc")
	public List<Integer> fetchAdminIds();
}
