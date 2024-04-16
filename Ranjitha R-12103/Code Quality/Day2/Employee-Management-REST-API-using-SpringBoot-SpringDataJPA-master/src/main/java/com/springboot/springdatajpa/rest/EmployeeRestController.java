package com.springboot.springdatajpa.rest;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springdatajpa.entity.Employee;
import com.springboot.springdatajpa.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}

	// GetMapping annotation used to find all the employees in the database
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	// GetMapping annotation used to find a specific employee using their id in the
	// database
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId);

		employee = Objects.requireNonNull(employee, "Employee Id not found " + employeeId);

		return employee;
	}

	// PostMapping annotation used to insert a new employee details
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {

		employeeService.save(employee);
		return employee;
	}

	// PutMapping is used to update the existing employee details
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	// DeleteMapping used to delete a employee details using their employee id
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId);

		employee = Objects.requireNonNull(employee, "Employee Id not found " + employeeId);

		employeeService.deleteById(employeeId);

		return "Deleted Employee id - " + employeeId;
	}

}
