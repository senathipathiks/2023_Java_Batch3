package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class EMSRestController {

	@Autowired
	EmployeeRepo repo;

	@PostMapping("/CreateEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		String msg = "";
		try {
			repo.save(employee);
			msg = "Employee object saved";

		} catch (Exception e) {
			msg = "Employee object not saved";

		}
		return msg;

	}

	@DeleteMapping("/DeleteEmployee/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId) {
		String msg = "";
		try {
			repo.deleteById(empId);
			msg = "Employee object Deleted";

		} catch (Exception e) {
			msg = "Employee object not Deleted";

		}
		return msg;

	}

	@GetMapping("/GetEmployee/{empId}")
	public Employee performFind(@PathVariable("empId") int empId) {
		return repo.findById(empId).get();

	}

	@GetMapping("GetByName/{empName}")
	public List<Employee> performFindByName(@PathVariable("empName") String empName) {

		return repo.findByEmpName(empName);

	}

	@DeleteMapping("DeleteByName/{empName}")
	public String performDeleteByName(@PathVariable("empName") String empName) {

		
		String msg = "";
		try {
			repo.deleteByEmpName(empName);
			msg = "Employee Deleted By Name";

		} catch (Exception e) {
			msg = "Employee  not Deleted By Name";

		}
		return msg;

	}

	@PutMapping("/UpdateEmployee")
	public String UpdateEmployee(@RequestBody Employee employee) {

		String msg = "";
		try {
			repo.save(employee);
			msg = "Employee Updated";

		} catch (Exception e) {
			msg = "Employee object not Updated";

		}
		return msg;

	}

	@GetMapping("/ViewAllEmployee")
	public List<Employee> viewallEmployee() {
		List<Employee> empList = (List<Employee>) repo.findAll();
		return empList;

	}

	@PostMapping("/EditOrDelete/{btn}")
	public String editOrDelete(@PathVariable String btn, @RequestBody Employee employee) {
		String msg = "";

		if (btn.equals("Edit")) {
			repo.save(employee);
			msg = "Employee object edited";
		} else if (btn.equals("Delete")) {
			repo.deleteById(employee.getEmpId());
			msg = "Employee object deleted";
		}

		return msg;
	}
}
