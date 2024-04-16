package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.bean.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

	@Query("select patientId from Hospital order by patientId asc")
	public List<Integer> fetchPatientIds();
}
