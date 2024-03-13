package com.day2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.day2.bean.Employee;
import com.day2.dao.EmployeeDAO;

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

	@RequestMapping("links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("links");
		return mv;
	}

	@RequestMapping("InsertEmployee")
	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}

	@RequestMapping("/PerformInsert")
	public ModelAndView performInsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee Object Inserted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Inserted");
		}
		return mv;
	}

	@RequestMapping("DeleteEmployee")
	public ModelAndView loaddeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/PerformDelete")
	public ModelAndView performDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		try {
//		dao.delete(employee);
			dao.deleteById(eid);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("DeleteByNameEmployee")
	public ModelAndView loaddeleteByNameEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteByNameEmployee");
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/PerformDeleteName")
	public ModelAndView performDeleteName(@RequestParam("ename") Employee ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteByNameEmployee");
		try {
			dao.delete(ename);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("FindEmployee")
	public ModelAndView loadfindEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFind(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		dao.findById(eid);
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

}
