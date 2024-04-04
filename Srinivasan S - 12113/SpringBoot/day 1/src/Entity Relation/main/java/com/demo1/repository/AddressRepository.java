package com.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo1.model.Address;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	 Address findByAddressId(int addressId);
	 
	List<Address> findByCityContaining(String city);

}
