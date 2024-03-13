package com.sbempapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbempapp.bean.Employee;
import com.sbempapp.repo.EmployeeRepo;

@Repository
public class EmployeeDAO {

	@Autowired
	EmployeeRepo repo;

	// save employee
	public Employee saveEmployee(Employee employee) {

		employee = repo.save(employee);
		return employee;
	}

	// get All ID from the database
	public List<Integer> getIdList() {

		return repo.findAllempId();
	}

	// get the employee by using employee ID
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}

	// update employee
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	// Delete employee
	public String deleteEmployee(Employee employee) {
		repo.delete(employee);
		return "deleted successfully";
	}

	// get employee names from database
	public List<String> getEmployeeNames() {
		return repo.findAllEmpName();
	}

	// getting employees from selected name
	public List<Employee> getEmployeesByName(String name) {

		return repo.findByName(name);
	}

	// delete employee by name
	public String deleteEmployeeByName(String name) {
		System.out.println("dao : " + name);
		repo.deleteByName(name);
		return "Success";
	}

	// fetching all the record from the database
	public List<Employee> getAllRecord() {
		return repo.findAll();

	}

	// update record request from fetchAll page
	public Employee updateEmpoyeeById(int id,Employee employee) {
		
		Employee emp = repo.findById(id).get();
		
		if(emp != null) {
			employee.setEmpId(id);
			System.out.println(employee);
			return repo.save(employee);
		}
		
		return null;
	}
	
	//delete record by using id
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Deleted successfully";
	}

}
