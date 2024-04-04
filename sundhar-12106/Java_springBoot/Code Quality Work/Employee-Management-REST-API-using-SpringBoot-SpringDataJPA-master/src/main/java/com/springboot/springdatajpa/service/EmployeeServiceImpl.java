package com.springboot.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.springdatajpa.dao.EmployeeRepository;
import com.springboot.springdatajpa.entity.Employee;

/************************************************* 

* Author: Sundhar Raj S

* Assignment: Code Quality

* Class: EmployeeServiceImpl

************************************************/ 
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private EmployeeRepository employeeRepository;

	//constructor used to initialize the employeeRepository
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	//this method is going to used for fetch all the employee details 
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	//this method is going to used for fetch the employee details using ID
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee theEmployee = null;
		if (result.isPresent())
			theEmployee = result.get();
		else
			throw new IllegalAccessError("Employee id not found - " + theId);

		return theEmployee;
	}

	//this method is going to used to add the employee to the database
	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
	}

	//this method is going to used to delete the employee using ID
	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}
}
