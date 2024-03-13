package com.employeeApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.employeeApplication.dao.EmployeeDAO;
import com.employeeApplication.dto.Employee;
import com.employeeApplication.util.ResponseStructure;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	public ResponseStructure<Employee> saveEmployee(Employee employee) {

		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("data saved successfully..!");
		rs.setData(dao.save(employee));

		return rs;

	}

	public ResponseStructure<Employee> fetchEmployee(int id) {

		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Data fetched Successfully...!");
		rs.setData(dao.fetch(id));

		return rs;

	}
	
	public ResponseStructure<List<Employee>> fetchAllEmployee() {
		
		ResponseStructure<List<Employee>> rs = new ResponseStructure<List<Employee>>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Data fetched Successfully...!");
		rs.setData(dao.fetchAll());
		return rs;
		
	}
	
	//update Employee
	public ResponseStructure<Employee> updateEmployee(Employee employee) {
		
		System.out.println(employee);

		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		
		Employee employee1 = dao.fetch(employee.getId());
		
		if(employee != null) {
			employee1.setName(employee.getName());
			employee1.setEmail(employee.getEmail());
			employee1.setSalary(employee.getSalary());
			rs.setStatusCode(HttpStatus.CREATED.value());
			rs.setMessage("data updated successfully..!");
			rs.setData(dao.save(employee1));
			System.out.println("hello ");
		}else {
			rs.setStatusCode(HttpStatus.CONFLICT.value());
			rs.setMessage("data not updated..!");
			rs.setData(null);
		}

		return rs;

	}
	
	
	//delete employee
	public ResponseStructure<String> deleteEmployeeById(int id) {
		
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setMessage("Employee record deleted successfully...!");
		System.out.println("hello from service"+id);
		rs.setData(dao.deleteById(id));
		return rs;
	}
	
	//fetch employee by name
	public ResponseStructure<List<Employee>> fetchByName(String name){
		
		ResponseStructure<List<Employee>> rs = new ResponseStructure<List<Employee>>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("data fetched successfully...!");
		rs.setData(dao.fetchByName(name));
		return rs;
	}

}
