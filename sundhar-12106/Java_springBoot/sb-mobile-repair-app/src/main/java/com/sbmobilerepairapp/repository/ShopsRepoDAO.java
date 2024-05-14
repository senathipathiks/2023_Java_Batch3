package com.sbmobilerepairapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbmobilerepairapp.entity.Shops;

@Repository
public class ShopsRepoDAO {
	
	private ShopsRepo repo;

	public ShopsRepoDAO() {
		super();
	}

	@Autowired
	public ShopsRepoDAO(ShopsRepo repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<Shops> getAllShops() {
		return repo.findAll();
		
	}
	
	

}
