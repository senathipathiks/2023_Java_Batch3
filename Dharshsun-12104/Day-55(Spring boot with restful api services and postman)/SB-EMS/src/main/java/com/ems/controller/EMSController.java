package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.ems.dao.EmployeeDAO;
import com.ems.dao.EmployeeRepo;

import jakarta.websocket.server.PathParam;

@RestController
public class EMSController {

	@Autowired
	EmployeeRepo repo;

	@GetMapping("/Start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;

	}

	@GetMapping("/Links")
	public ModelAndView links() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;

	}

	@GetMapping("/InsertEmployee")
	public ModelAndView InsertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;

	}

	@PostMapping("/CreateEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		String msg = "";
		try {
			repo.save(employee);
			msg =  "Employee object saved";

		} catch (Exception e) {
			msg =  "Employee object not saved";
		}
		return msg;
	}
	
	@RequestMapping("/PerfromInsert1")
	public ModelAndView PerfromInsert1(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");
		try {
			repo.save(employee);
			mv.addObject("msg", "Employee object saved");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object  not saved");
		}
		List<Employee> empList= (List<Employee>) repo.findAll();
		 mv.addObject("empList", empList);
		return mv;
	}

//	@RequestMapping("/DeleteEmployee")
//	public ModelAndView DeleteEmployee() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("DeleteEmployee");
//		List<Integer> idList = dao.getIdList();
//		mv.addObject("IdList", idList);
////		System.out.println(idList);
//
//		return mv;
//
//	}

	@RequestMapping("/FindEmployee")
	public ModelAndView findEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");

		List<Integer> idList = repo.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);

		return mv;

	}
	
	@GetMapping("/FindAllEmployee")
	public List<Employee> findAllEmployee() {
		List<Employee> empList = (List<Employee>) repo.findAll();
		return empList;

	}
	
	
	
	@RequestMapping("/UpdateEmployee")
	public ModelAndView updateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		List<Integer> idList = repo.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);

		return mv;

	}
	
	

	



	@DeleteMapping("/DeleteEmployee/{empId}")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public int deleteEmployee(@PathVariable("empId") int empId) {
		String msg = " ";
		try {
			repo.deleteById(empId);
			msg= "Employee object deleted";

		} catch (Exception e) {
			msg= "Employee object deleted";
		}
		
		return empId;
	}
	
	@GetMapping("/GetEmployee/{empId}")
	public Employee performFind(@PathVariable("empId") int eid) { //for getting details in browser
		return repo.findById(eid).get();
	}
	
	@PutMapping("/UpdateEmployee")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public String updateEmployee(@RequestBody Employee employee) {
		String msg = "";
		try {
			repo.save(employee);
			msg= "Employee object updated";

		} catch (Exception e) {
			msg= "Employee object updated";
		}
		
		return msg;
	}
	




	@DeleteMapping("/DeleteEmployeeName/{empName}")
	public String deleteEmployeeName(@PathVariable("empName") String ename) {
		String msg = "";
		try {
			repo.deleteByEmpName(ename);
			msg = "Employee Object Deleted";
		} catch (Exception e) {
			msg = "Employee Object Not Deleted";
		}
		return msg;
	}

	@GetMapping("/GetFindByName/{empName}")
	
	public Employee perfromFindname(@PathVariable("empName") String empName) {
		
		return repo.findByEmpName(empName).get(0);
	}
	
	
	@PostMapping("EditOrDelete/{btn}")
	public String editorRemove(@PathVariable("btn")String button,@RequestBody Employee employee) {
		String msg = "";
		
		if(button.equals("Edit")) {
			repo.save(employee);
			msg = "Employee Object Updated";
		}
		if(button.equals("Delete")) {
			repo.deleteById(employee.getEmpId());
			msg = "Employee Object Deleted";
		}
		
		return msg;
	}
}
