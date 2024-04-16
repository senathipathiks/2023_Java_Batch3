package com.rrs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rrs.bean.Train;

public interface TrainRepository  extends JpaRepository<Train, Integer>{

	@Query("select trainId from Train order by trainId asc")
	public List<Integer> fetchTrainIds();
}
