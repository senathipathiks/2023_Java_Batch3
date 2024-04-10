package com.vms.repo;

import org.springframework.data.repository.CrudRepository;

import com.vms.model.Vehicle;

public interface Repository extends CrudRepository<Vehicle, Integer>{
	
	

}
