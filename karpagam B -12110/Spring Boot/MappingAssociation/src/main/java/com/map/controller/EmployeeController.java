package com.map.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.map.bean.Employee;
import com.map.repository.EmployeeRepository;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	//to insert the data
	@PostMapping("/EmpInsert")
	Employee newEmployee(@RequestBody Employee newEmployee ) {
		return employeeRepo.save(newEmployee);
	}
	
	//get all department details
	@GetMapping("/getAllEmp")

	List<Employee> getAllDepartment() {
		return (List<Employee>) employeeRepo.findAll();
	}	
	
	//delete
	@DeleteMapping("/doEmpDelete/{id}")
	public String DeleteEmployee(@PathVariable("id") int id) {
		String msg = "";
		try {
			employeeRepo.deleteById(id);
			msg = "Employee Data Deleted";
		} catch (Exception e) {
			msg = "Employee Data not Deleted";
		}
		return msg;
	}
	//get by id
	@GetMapping("/GetEmpId/{id}")
	public Optional<Employee> doEmpFind(@PathVariable("id") int id) {
	   return employeeRepo.findById(id);
	}

	//update
		@PutMapping("/doEmpUpdate")
		Employee updateEmployee(@RequestBody Employee emp) {

			return employeeRepo.save(emp);
		}

    //to get all the Id  
    @GetMapping("/getEmpIdList")
		List<Integer> getEmpbylist() {
			List<Integer> idlist = employeeRepo.getAllEmpId();
			return idlist;
			}
	
	

}
