package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.EmployeeDTO;
import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;
import com.demo.service.EmployeeService;

@Service
public class employeeIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public String addEmployee(EmployeeDTO employeeDTO) {

		Employee employee = new Employee(

				employeeDTO.getEmployeeId(), employeeDTO.getEmployeeName(), employeeDTO.getAddress(),
				employeeDTO.getMobile());
		 
		employeeRepo.save(employee);
		return employee.getEmployeeName() ;
	}

}
