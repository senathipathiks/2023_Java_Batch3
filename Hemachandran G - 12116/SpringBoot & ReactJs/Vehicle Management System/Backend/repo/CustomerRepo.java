package com.vms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vms.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	@Query("select customerId from Customer order by customerId")
	public List<Integer> getIdList();
	

}
