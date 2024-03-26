package com.ems2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems2.bean.Employee;
import com.ems2.dao.EmployeeDAO;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO dao;
	
	
	@RequestMapping("/Start")
	public ModelAndView startApp() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/Links")
	public ModelAndView loadLinks() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("links");
		return mv;
	}
	
	@RequestMapping("/Insert")
	public ModelAndView insertPage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("insert");
		return mv;
	}
	
	@RequestMapping("/Insertemp")
	public ModelAndView insertEmp(Employee emp) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("insert");
		try {
			dao.save(emp);
			mv.addObject("msg", "Sucessfully inserted");
		} catch (Exception e) 
		{
		 mv.addObject("msg", "Insertion failure");
		}
		return mv;
	}
	
	@RequestMapping("/Delete")
	public ModelAndView deletePage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("delete");
		List<Integer> list=dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	
	
	@RequestMapping("/DeleteEmp")
	public ModelAndView deleteEmp(@RequestParam("eid") int eid) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("delete");
		try {
			dao.deleteById(eid);
		
			mv.addObject("msg", "Sucessfully deleted");
		} catch (Exception e) 
		{
		 mv.addObject("msg", "deletion failure");
		}
		List<Integer> list=dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	
	@RequestMapping("/DeleteByName")
	public ModelAndView deletePage1() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("deletebyname");
		ArrayList<String> list1=dao.getNameList();
		mv.addObject("list1", list1);
		return mv;
	}
	
	@RequestMapping("/DeleteEmp1")
	public ModelAndView deleteEmp(@RequestParam("ename") String ename) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("deletebyname");
		try {
			dao.deleteByEname(ename);
		
			mv.addObject("msg", "Sucessfully deleted");
		} catch (Exception e) 
		{
		 mv.addObject("msg", "deletion failure");
		}
		ArrayList<String> list1=dao.getNameList();
		mv.addObject("list1", list1);
		return mv;
	}
	
	@RequestMapping("/Find")
	public ModelAndView findPage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("find");
		List<Integer> list2=dao.getIdList();
		mv.addObject("list", list2);
		return mv;
	}
	
	
	
	@RequestMapping("/FindEmp")
	public ModelAndView findEmp(@RequestParam("eid") int eid) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("find");
		try {
			Employee employee = dao.findById(eid).get();
		
			mv.addObject("msg", "Sucessfully founded");
			mv.addObject("emp1", employee);
		} catch (Exception e) 
		{
		 mv.addObject("msg", "find failure");
		}
		List<Integer> list2=dao.getIdList();
		mv.addObject("list", list2);
		return mv;
	}
	
	@RequestMapping("/FindAll")
	public ModelAndView findAllPage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("findall");
		List<Employee> list2=dao.findAll();
		mv.addObject("list1", list2);
		return mv;
	}
	
	@RequestMapping("/removeEmp")
	public ModelAndView removeEmp(@RequestParam("btn") String btn,Employee emp) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("findall");
		
		if(btn.equals("Remove")) {
		dao.deleteById(emp.getEid());
		}
		else if(btn.equals("Edit")) 
		{
		 dao.save(emp);
		}
		ArrayList<Employee> list=(ArrayList<Employee>) dao.findAll();
		mv.addObject("list1", list);
		
		return mv;
	}
	
	@RequestMapping("/FindByName")
	public ModelAndView findbyname() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("findbyname");
		ArrayList<String> list1=dao.getNameList();
		mv.addObject("list1", list1);
		return mv;
	}
	
	@RequestMapping("/FindEmp1")
	public ModelAndView findbyname(@RequestParam("ename") String ename) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("findbyname");
		
		try {
			List<Employee> emp=dao.findByEname(ename);
			mv.addObject("list", emp);
		} catch (Exception e) {
			mv.addObject("msg", "find failure");
		}
		ArrayList<String> list1=dao.getNameList();
		mv.addObject("list1", list1);
		
		return mv;
	}
	
	@RequestMapping("/Update")
	public ModelAndView updatePage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("update");
		List<Integer> list=dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/FetchEmp")
	public ModelAndView fetchPage(@RequestParam("eid") int eid) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("update");
		Employee emp=dao.findById(eid).get();
		List<Integer> list2=dao.getIdList();
		mv.addObject("list", list2);
		mv.addObject("emp", emp);
		return mv;
	}
	@RequestMapping("/UpdateEmp")
	public ModelAndView updateEmp(Employee emp) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("update");
		try {
			dao.save(emp);
			mv.addObject("msg", "Sucessfully updated");
		} catch (Exception e) 
		{
		 mv.addObject("msg", "updation failure");
		}
		List<Integer> list2=dao.getIdList();
		mv.addObject("list", list2);
		return mv;
	}
	@RequestMapping("/Addition")
	public ModelAndView AddEmp(Employee emp) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("findall");
			dao.save(emp);
			ArrayList<Employee> list=(ArrayList<Employee>) dao.findAll();
			mv.addObject("list1", list);
			
	
		return mv;
	}
}
