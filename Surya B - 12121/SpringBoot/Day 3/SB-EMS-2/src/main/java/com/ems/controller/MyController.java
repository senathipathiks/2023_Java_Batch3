package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDao;

@Controller
public class MyController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("Start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}
	
	@RequestMapping("InsertEmployee")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		List<Integer> list = dao.getIdList();
		List<String> slist = dao.getNameList();
		mv.addObject("list", list);
		mv.addObject("slist", slist);
		return mv;
	}
	
	@RequestMapping("performInsert")
	public ModelAndView doInsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee Object Saved ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Object Not Saved ");
		}
		
		return mv;
	}
	@RequestMapping("performDelete")
	public ModelAndView doDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
			dao.deleteById(eid);
			mv.addObject("msg", "Employee Details Removed successfully ");
			List<Integer> list = dao.getIdList();
			mv.addObject("list", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
		}
		
		return mv;
	}
	
	@RequestMapping("performDeleteByName")
	public ModelAndView doDelete(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
			dao.removeByEname(ename);
			mv.addObject("msg", "Employee Details Removed successfully ");
			
			List<String> slist = dao.getNameList();
			mv.addObject("slist", slist);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
			
		}
		List<Integer> list = dao.getIdList();
		List<String> slist = dao.getNameList();
		mv.addObject("list", list);
		mv.addObject("slist", slist);
		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		List<Integer> list = dao.getIdList();
		List<String> slist = dao.getNameList();
		mv.addObject("list", list);
		mv.addObject("slist", slist);
		
		return mv;
	}
	
	
	@RequestMapping("PerformFind")
	public ModelAndView doFind(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		try {
			Employee emp = dao.findById(eid).get();
			if(emp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			}
			mv.addObject("emp", emp);
			String msg = "id";
			mv.addObject("msg", msg);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
		}
		List<Integer> list = dao.getIdList();
		mv.addObject("list", list);
		List<String> slist = dao.getNameList();
		mv.addObject("slist", slist);
		return mv;
	}
	
	@RequestMapping("PerformFindByName")
	public ModelAndView doFindName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		System.out.println(ename);
		try {
			List<Employee> list = dao.findByEname(ename);
			System.out.println(list);
			mv.addObject("emp", list);
			String msg = "name";
			mv.addObject("msg", msg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
		}
		List<Integer> list = dao.getIdList();
		mv.addObject("list", list);
		List<String> slist = dao.getNameList();
		mv.addObject("slist", slist);
		
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		List<Integer> list = dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("PerformFetch")
	public ModelAndView doFetch(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		try {
			Employee emp = dao.findById(eid).get();
			if(emp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			}
			mv.addObject("emp", emp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
		}
		List<Integer> list = dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView doUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		try {
			Employee empUp = dao.save(emp);
			if(empUp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			}
			mv.addObject("msg", "Record Updated Successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.addObject("msg", "Employee Details Removal Failed ");
		}
		List<Integer> list = dao.getIdList();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		
		return mv;
	}
	
	@RequestMapping("EditOrDelete")
	public ModelAndView editOrDelete(@RequestParam("btn")String btn, Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		if(btn.equals("Edit/Save")) {
			dao.save(employee);
		}
		if(btn.equals("Delete")) {
		  dao.deleteById(employee.getEid());
		}
		
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		
		return mv;
	}
	

	
}
