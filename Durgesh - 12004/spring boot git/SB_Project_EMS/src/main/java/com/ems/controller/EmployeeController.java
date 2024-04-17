package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ems.bean.Employees;
import com.ems.exception.EmployeeNotFoundException;
import com.ems.repo.EmployeeRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepo;
	
	
	@PostMapping("/insertEmployee")
	Employees newEmp(@RequestBody Employees newEmp) {
		try {
			return employeerepo.save(newEmp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newEmp;
	}
	
	
	@GetMapping("/employees")
	List<Employees> getAllEmployees(){
		return employeerepo.findAll();
	}
	
	
	@GetMapping("/getEmployee/{id}")
	Employees getEmployeeById(@PathVariable Long id) {
		return employeerepo.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException(id));
	}
	
	@GetMapping("/getEmployeeId")
	public List<Integer> getAllEmployeeId() {
		return employeerepo.getEmpId();
		}
	
	
	@GetMapping("/getEmployeeName/{id}")
	Employees getEmployeeByName(@PathVariable String name) {
		return (Employees) employeerepo.findByName(name);
	}
	
	
	@PutMapping("/updateEmployee/{id}")
	Employees updateEmployee(@RequestBody Employees newEmp, @PathVariable Long id) {
		return employeerepo.findById(id)
				.map(employees -> {
					employees.setName(newEmp.getName());
					employees.setDept(newEmp.getDept());
					employees.setSalary(newEmp.getSalary());
					return employeerepo.save(employees);
				}).orElseThrow(() -> new EmployeeNotFoundException(id));
	}
	
	
	@DeleteMapping("/deleteEmployee/{id}")
	String deleteEmp(@PathVariable Long id) {
		if(!employeerepo.existsById(id)) {
			throw new EmployeeNotFoundException(id);
		}
		employeerepo.deleteById(id);
		return "Employee with id "+id+" has been deleted successfully.";
	}
	
	
}
