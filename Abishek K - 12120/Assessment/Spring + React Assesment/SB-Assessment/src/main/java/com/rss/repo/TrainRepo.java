package com.rss.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rss.bean.Train;

import jakarta.transaction.Transactional;

public interface TrainRepo extends CrudRepository<Train, Integer> {
	
	@Transactional
	public List<Train> findByTrName(String trName);
	
	@Transactional
	public void deleteByTrName(String trName);

}
