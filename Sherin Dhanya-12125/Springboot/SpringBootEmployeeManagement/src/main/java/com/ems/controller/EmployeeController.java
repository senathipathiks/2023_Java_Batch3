package com.ems.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/Start")
	public ModelAndView startApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping("/Links")
	public ModelAndView linkApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("links");
		return mv;
	}
	@RequestMapping("/InsertEmployee")
	public ModelAndView insertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insert");
		return mv;
	} 
	@RequestMapping("/PerformInsert")
	public ModelAndView performInsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insert");
		try {
		dao.save(employee);
		mv.addObject("msg","Employee Object Inserted");
		}
		catch (Exception e) { 
			mv.addObject("msg","Employee Object  not Inserted");
		}
		return mv;
	}
// delete employee	
	
	@RequestMapping("/DeleteEmployeeById")
	public ModelAndView deleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		
		List<Integer> idList = dao.getIdList();
	mv.addObject("IdList",idList);
//		System.out.println(idList);
		return mv;
	} 
	@RequestMapping("/PerformDelete")
	public ModelAndView performDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		try {
		dao.deleteById(eid);
		mv.addObject("msg","Employee Object Deleted");
		}
		catch (Exception e) { 
			mv.addObject("msg","Employee Object  not Deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList",idList);
		return mv;
	}
	
//	delete employee by name
	
	@RequestMapping("/DeleteEmployeeByName")
	public ModelAndView deleteEmployeeName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletename");
		
		List<String> nameList = dao.getNameList();
	mv.addObject("NameList",nameList);
//		System.out.println(idList);
		return mv;
	} 
	
	@RequestMapping("/PerformDeleteByName")
	public ModelAndView performDeleteName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletename");
		try {
		dao.deleteByEname(ename);
		mv.addObject("msg","Employee Object Deleted");
		}
		catch (Exception e) { 
			System.out.println(e);
			mv.addObject("msg","Employee Object  not Deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList",nameList);
		return mv;
	}
	
//	find employee
	
	@RequestMapping("/FindEmployee")
	public ModelAndView FindEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("find");
		
		List<Integer> idList = dao.getIdList();
	mv.addObject("IdList",idList);
//		System.out.println(idList);
		return mv;
	} 
	
	@RequestMapping("/PerformFind")
	public ModelAndView performFind(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("find");
		try {
		Employee emp = dao.findById(eid).get();
		if(emp == null) {
			mv.addObject("msg","Employee Object  not Founded");
			
		}
		else {
			mv.addObject("Emp",emp);
		}
		mv.addObject("msg","Employee Object Found");
		}
		catch (Exception e) { 
			mv.addObject("msg","Employee Object  not Founded");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList",idList);
		return mv;
	}

//	find employee by name
	
	@RequestMapping("/FindEmployeeByName")
	public ModelAndView FindEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findname");
		
		List<String> nameList = dao.getNameList();
	mv.addObject("NameList",nameList);
//		System.out.println(idList);
		return mv;
	} 
	
	@RequestMapping("/PerformFindByName")
	public ModelAndView performFindByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findname");
		try {
		List<Employee> emp = dao.findByEname(ename);
		if(emp == null) {
			mv.addObject("msg","Employee Object  not Founded");
			
		} 
		else {
			mv.addObject("Emp",emp);
		}
		mv.addObject("msg","Employee Object Found");
		}
		catch (Exception e) { 
			mv.addObject("msg","Employee Object  not Founded");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList",nameList);
		return mv;
	}
	
	
//	Updating
	
	@RequestMapping("/UpdateEmployee")
	public ModelAndView UpdateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");
		
		List<Integer> idList = dao.getIdList();
	mv.addObject("IdList",idList);
//		System.out.println(idList);
		return mv;
	} 
	
//	fetch employee by id
	
	@RequestMapping("/FetchEmployee")
	public ModelAndView FetchEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");
		Employee emp = dao.findById(eid).get();
		
		List<Integer> idList = dao.getIdList();
	mv.addObject("IdList",idList);
		mv.addObject("Emp",emp);
		return mv;
	} 
	
//	Update employee
	
	
	@RequestMapping("/PerformUpdate")
	public ModelAndView performUpdate(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");
		try {
		dao.save(employee);
		mv.addObject("msg","Employee object updated");
		}
		catch (Exception e) {
			mv.addObject("msg","Employee object not updated");
		}
		
		List<Integer> idList = dao.getIdList();
	mv.addObject("IdList",idList);
		
		return mv;
	} 
	
//	find all
	
	@RequestMapping("/FindAllEmployee")
	public ModelAndView findAllEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findall");
		
		List<Employee> empList= (List<Employee>) dao.findAll();
		mv.addObject("EmpList",empList);

		return mv;
	} 
	
	@RequestMapping("/Edit")
	public ModelAndView editOrDelete(@RequestParam("btn") String btn, Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findall");

		if(btn.equals("update")) {
			dao.save(employee);

		}
		if(btn.equals("Delete")) {
			dao.deleteById(employee.getEid());
		}
		if(btn.equals("Add")){
			dao.save(employee);
		}
		List<Employee> empList= (List<Employee>) dao.findAll();
		mv.addObject("EmpList",empList);

		return mv;
	} 
	
}
