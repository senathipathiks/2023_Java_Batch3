package com.map.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.map.bean.Organization;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
	
	
	@Query("select id from Organization")
	public List<Integer> getAllOrgId();

}
