package com.ems.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EMSWebController {
	
	
	@Autowired
	EmployeeDAO dao;
	
	
	@RequestMapping("start")
	public ModelAndView loadStart() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	
	@RequestMapping("Link")
	public ModelAndView loadLink() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Link");
		return mv;
	}
	
	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Banner");
		return mv;
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView doList() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hemachandran");
		mv.setViewName("Delete");
		List<Integer> idList = dao.getIdList();
		System.out.println(idList);
		
		List<String> nameList = dao.getNameList();
		System.out.println(nameList);
		
		mv.addObject("idList",idList);
		mv.addObject("nameList",nameList);
		
		return mv;
		
	}
	
	@RequestMapping("Find")
	public ModelAndView doFind() {
		ModelAndView mv = new ModelAndView();
		System.out.println("Hemachandran");
		mv.setViewName("Find");
		List<Integer> idList = dao.getIdList();
		System.out.println(idList);
		
		List<String> nameList = dao.getNameList();
		System.out.println(nameList);
		
		
		mv.addObject("nameList",nameList);
		mv.addObject("idList",idList);

		return mv;
		
	}
	
	@RequestMapping("Update")
	public ModelAndView doUpdate() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Update");
		List<Integer> idList = dao.getIdList();
		System.out.println(idList);
		
		List<String> nameList = dao.getNameList();
		System.out.println(nameList);
		
		
		mv.addObject("nameList",nameList);
		mv.addObject("idList",idList);

		return mv;
		
	}
	
	@RequestMapping("FetchEmployee")
	public ModelAndView doFetch(@RequestParam("empId") int empId) {
		ModelAndView mv = new ModelAndView();		
		
		mv.setViewName("Update");
		Employee emp = dao.findById(empId).get();
		
		mv.addObject("emp", emp);
		
		

		return mv;
		
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadAll() {
		ModelAndView mv = new ModelAndView();
		List<Integer> list = dao.getIdList();
		List<Employee> elist = (List<Employee>) dao.findAllById(list);
		mv.addObject("NameList",elist);
		mv.setViewName("FindAll");
		
		return mv;
	}
	
	/****************************************************************************************************/
	
	
	@RequestMapping("InsertOperation")
	public ModelAndView doInsert(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		try {
		dao.save(emp);
		mv.addObject("msg","Employee Data Inserted");
		}catch (Exception e) {
			mv.addObject("msg","Employee Data Not Inserted");
		}
		
		return mv;
	}
	

	
	@RequestMapping("DeleteOperation")
	public ModelAndView doDelete(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
		dao.deleteById(empId);
		mv.addObject("msg","Employee Data Deleted Successfully");
		}catch (Exception e) {
			mv.addObject("msg","Employee Data Not Deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList",idList);
		return mv;
	}
	@RequestMapping("UpdateEmployee")
	public ModelAndView doUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		try {
			dao.save(emp);
			mv.addObject("msg","Employee Data Updated Successfully");
		}catch (Exception e) {
			mv.addObject("msg","Employee Data Not Updated");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("DeleteByName")
	public ModelAndView makeDelete(@RequestParam("empName")String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
		dao.removeByEmpName(empName);
		mv.addObject("emsg","Employee Data Deleted Successfully");
		}catch (Exception e) {
			mv.addObject("emsg","Employee Data Not Deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	
	@RequestMapping("FindEmployee")
	public ModelAndView performFind(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		
		try {
		Employee emp = dao.findById(empId).get();
		if(emp == null) {
			mv.addObject("msg","Employee Data Not Found");
		}else {
			mv.addObject("Emp",emp);
		}
		
		}catch (Exception e) {
			mv.addObject("msg","Employee Data Not Found");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("FindEmployeeByName")
	public ModelAndView performFind(@RequestParam("empName")String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		try {
		List<Employee> list =  dao.findByEmpName(empName);
		if(list == null) {
			mv.addObject("msg","Employee Data Not Found");
		}else {
			
			mv.addObject("NameList",list);
		}
		
		}catch (Exception e) {
			mv.addObject("msg","Employee Data Not Found");
		}
		List<String> nameList = dao.getNameList();
		;
		return mv;
	}
	
	@RequestMapping("DoAction")
	public ModelAndView findAll(@RequestParam("button")String btn, Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		System.out.println(emp);
		System.out.println(btn);
		
		 if(btn.equals("Edit"))
				{
					dao.save(emp);
				}
		else if(btn.equals("Remove"))
		{
			dao.deleteById(emp.getEmpId());
		}
		List<Employee> empList = (List<Employee>)dao.findAll();
		mv.addObject("NameList", empList);
		return mv;
	}
	

}
