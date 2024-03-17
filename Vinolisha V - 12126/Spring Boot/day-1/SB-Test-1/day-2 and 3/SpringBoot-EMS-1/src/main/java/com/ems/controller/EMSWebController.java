package com.ems.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ems.bean.Employee;

import com.ems.dao.EmployeeRapo;

@RestController
public class EMSWebController {

	@Autowired // easily plug and unplugable
	EmployeeRapo rapo;
	
	@PostMapping("/CreateEmployee")
	public String performInsert(@RequestBody Employee employee) {
		String msg = "";
		try {
			rapo.save(employee);
			msg = "Employee Object Saved";
		} catch (Exception e) {

			msg = "Employee Object Not Saved";
		}
		return msg;
	}
//====================================================================================================

	@GetMapping("/findEmployee/{eid}")
	public Employee performFind(@PathVariable("eid") int eid) {
		return rapo.findById(eid).get();
	}
//====================================================================================================
	
		@GetMapping("/findByName/{ename}")
		public ArrayList<Employee> FindByName(@PathVariable("ename") String ename) {
			return rapo.findByEname(ename);
		}

//====================================================================================================
		
		@GetMapping("/findBySalary/{esalary}")
		public ArrayList<Employee> FindBySalary(@PathVariable("esalary") Integer esalary) {
			return rapo.findByEsalary(esalary);
		}
//=====================================================================================================
	@GetMapping("/findAll") // reading the data from the database so get mapping
	public List<Employee> viewAllEmployee() {
		ArrayList<Employee> empList = (ArrayList<Employee>) rapo.findAll();
		return empList;
	}


//====================================================================================================

	
	// Deletion
	@DeleteMapping("/DeleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable("eid") int eid) {
		String msg = "";
		try {
			rapo.deleteById(eid);
			msg = "Employee Details Deleted Successfully";
		} catch (Exception e) {

			msg = "Employee Details Not Found";
		}

		return msg;
	}

//================================================================================================
	@DeleteMapping("/DeleteByName/{ename}")
	public String deleteEmployeeByName(@PathVariable("ename") String ename) {

		String msg = "";
		try {
			rapo.deleteByEname(ename);
			msg = "Employee Details Deleted Successfully";
		} catch (Exception e) {

			msg = "Employee Details Not Found";
		}
		return msg;
	}
//=====================================================================================================
	
	@DeleteMapping("/DeleteBySalary/{esalary}")
	public String deleteEmployeeBySalary(@PathVariable("esalary") Integer esalary) {

		String msg = "";
		try {
			rapo.deleteByEsalary(esalary);
			msg = "Employee Details Deleted Successfully";
		} catch (Exception e) {

			msg = "Employee Details Not Found";
		}
		return msg;
	}

//=====================================================================================================
	
	@PutMapping("/UpdateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		String msg = "";
		try {
			rapo.save(employee);
			msg = "Employee Object Saved";
		} catch (Exception e) {

			msg = "Employee Object Not Saved";
		}

		return msg;
	}
//======================================================================================================

	@PostMapping("/EditOrDelete/{btn}")
	public String editEmployee(@PathVariable String btn, @RequestBody Employee employee) {
		String msg = "";
		if (btn.equals("Edit")) {
			rapo.save(employee);
			msg="Record Edited Successfully";
		} else if (btn.equals("Delete")) {
			rapo.deleteById(employee.getEid());
			msg="Record Deleted Successfully";
		}

		return msg;
	}

}
