package com.employeeApplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApplication.dto.Employee;
import com.employeeApplication.service.EmployeeService;
import com.employeeApplication.util.ResponseStructure;



@RestController
@CrossOrigin("http://localhost:3000/")
//@CrossOrigin("http://localhost:3001")
//@CrossOrigin("http://localhost:3000/add-employees/")
public class EmpController {
	
	
	
	private EmployeeService service;
	
	 
	public EmpController(EmployeeService service) {
		super();
		this.service = service;
	}


	@PostMapping("save")
	public ResponseStructure<Employee> save(@RequestBody Employee employee) {
		
		ResponseStructure<Employee> rs = service.saveEmployee(employee);
		employee = rs.getData();
		String body = "Welcome to Relevantz MR/MRS : "+employee.getName()+"\nEmployee ID : "+employee.getId();
		String subject = "Congratulation from Relevantz";
		service.sendEmail(employee.getEmail(), subject, body);
		return rs;
	}
	
	
	@GetMapping("getEmp")
	public ResponseStructure<Employee> getEmployee(@RequestParam int id) {
		return service.fetchEmployee(id);
	}
	
	@GetMapping("getAll")
	public ResponseStructure<List<Employee>> getAll() {
		return service.fetchAllEmployee();
	}
	
	@GetMapping("getAllId")
	public ResponseStructure<List<Integer>> getAllEmployeeId(){
		return service.getIdList();
	}
	
	@GetMapping("getAllnames")
	public ResponseStructure<List<String>> getAllEmployeeNames() {
		return service.getAllNames();
	}
	
	
	
	@PutMapping("update")
	public ResponseStructure<Employee> updateEmployee(@RequestBody Employee employee){
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("delete")
	public ResponseStructure<String> deleteEmployee(@RequestParam int id){
		return service.deleteEmployeeById(id);
	}
	
	@GetMapping("fetchByName")
	public ResponseStructure<List<Employee>> getByName(@RequestParam String name) {
		return service.fetchByName(name);
	}
	
	@GetMapping("search")
	public ResponseStructure<List<Employee>> searchEmployee(@RequestParam String input) {
		
		
		return service.searchEmployee(input);
	}
	
	
	@DeleteMapping("deleteByName/{name}")
	public ResponseStructure<String> deleteByEmployeeName(@PathVariable String name){
		return service.deleteByName(name);
	}
	

}
