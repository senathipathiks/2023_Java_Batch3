package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@Controller
public class EMSController {
	
	@Autowired
	EmployeeDAO dao;

	@RequestMapping("/Start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
		
	}
	@RequestMapping("/Links")
	public ModelAndView links() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
		
	}
	@RequestMapping("/InsertEmployee")
	public ModelAndView InsertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
		
	}
	@RequestMapping("/PerfromInsert")
	public ModelAndView PerfromInsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		try {
		dao.save(employee);
		mv.addObject("msg","Employee object saved");
		
	}catch(Exception e) {
		mv.addObject("msg","Employee object  not saved");
	}
		return mv;
	}
	@RequestMapping("/DeleteEmployee")
	public ModelAndView DeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList",idList);
//		System.out.println(idList);
		
		return mv;
		
	}
	@RequestMapping("/PerfromDelete")
	/*public ModelAndView PerfromDelete(Employee employee) {*/
	public ModelAndView PerfromDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		try {
		dao.deleteById(eid);
		mv.addObject("msg","Employee object deleted");
		
	}catch(Exception e) {
		mv.addObject("msg","Employee object  deleted");
	}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList",idList);
		return mv;
	}
}
