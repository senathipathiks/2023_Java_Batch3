package com.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
