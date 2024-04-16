package com.ems.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
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

import jakarta.websocket.server.PathParam;

@RestController
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	@GetMapping("/start")
	public ModelAndView startApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Banner");
		return mv;
	}
	@GetMapping("Links")
	public ModelAndView loadLink() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("links");
		return mv;
	}
	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		return mv;
	}
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	// it is used to integrate with the er
	@RequestMapping("FindAll")
	public List<Employee> loadFindAll() {
		ArrayList<Employee> empList = (ArrayList<Employee>) dao.findAll();
		return empList;
	}
	@RequestMapping("Update")
	public ModelAndView loadUpadte() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	@RequestMapping("DeleteName")
	public ModelAndView loadDeleteName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteByName");
		List<String> nameList = dao.getNameList();
		mv.addObject("nameList", nameList);
		return mv;
	}
	@RequestMapping("FindByName")
	public ModelAndView loadFindByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findByName");
		List<String> nameList = dao.getNameList();
		mv.addObject("nameList", nameList);
		return mv;
	}
	@RequestMapping("FetchEmployee")
	public ModelAndView fetchEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView("Update");

		try {
			Employee empList = dao.findById(eid).get();
		 	mv.addObject("empList", empList);

		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Not Found");

		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}

	// Crud Operations
	// Insert Page Operation
	@PostMapping("CreateEmployee")
	public String createEmployee(@RequestBody Employee emp) {

		String msg = " ";
		try {
			dao.save(emp);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			msg = "Employee Object Not Saved";
		}
		return msg;

	}

	@DeleteMapping("DeleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable("eid") int eid) {
		String msg = " ";
		try {
			dao.deleteById(eid);
			msg = "Employee Object Deleted";
		} catch (Exception e) {
			msg = "Employee Object Deleted";
		}
		return msg;

	}

	@DeleteMapping("DeleteEmployeeByName/{ename}")
	public String deleteEmployeeByName(@PathVariable("ename") String ename) {
		String msg = " ";
		try {
			dao.deleteByEname(ename);
			msg = "Employee Object Deleted";
		} catch (Exception e) {
			msg = "Employee Object Deleted";
		}
		return msg;

	}

	@GetMapping("GetEmployee/{eid}")
	public Employee doFind(@PathVariable("eid") int eid) {
		return dao.findById(eid).get();
	}

	@RequestMapping("GetEmployeeByName/{ename}")
	public List<Employee> doFindByName(@PathVariable("ename") String ename) {

		return dao.findByEname(ename);
	}

	@PutMapping("UpdateEmployee")
	public String updateEmployee(@RequestBody Employee emp) {

		String msg = " ";
		try {
			dao.save(emp);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			msg = "Employee Object Not Saved";
		}
		return msg;

	}

	@PostMapping("/FindAllOrEditOrUpdate/{btn}")
	public String doFindAllOperations(@PathVariable("btn") String btn, @RequestBody Employee emp) {
		String msg = " ";
		if (btn.equals("Edit")) {
			dao.save(emp);
			msg = "Employee Object Saved";
		} else if (btn.equals("Remove")) {
			dao.deleteById(emp.getEid());
			msg = "Employee Object Deleted";
		}
		return msg;
		}
}
