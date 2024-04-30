package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EMSWebController {
	@Autowired
	EmployeeDAO dao;

	@RequestMapping("/Start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;

	}

	@RequestMapping("/Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;

	}

	@RequestMapping("/InsertEmployee")
	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;

	}

	@RequestMapping("/PerformInsert")
	public ModelAndView loadInsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee object Inserted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee object not Inserted");
		}
		return mv;

	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView loadDelete(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/PerformDelete")
	public ModelAndView loadDeleteEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		try {
			dao.deleteById(eid);

			mv.addObject("msg", "Employee object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee object not Deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);

		return mv;

	}

	@RequestMapping("DeleteEmployeeByName")
	public ModelAndView loadDeleteEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeByName");

		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);

		return mv;

	}

	@RequestMapping("/PerformDeleteByName")
	public ModelAndView loadDeleteEmployeeByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeByName");
		try {
			dao.deleteByEname(ename);

			mv.addObject("msg", "Employee object Deleted");
		} catch (Exception e) {

			System.out.println(e);
			mv.addObject("msg", "Employee object not Deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);

		return mv;

	}

	@RequestMapping("/FindEmployee")
	public ModelAndView LoadFind(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");

		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);

		return mv;

	}

	@RequestMapping("/PerformFind")
	public ModelAndView DoFindEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		try {
			Employee emp = dao.findById(eid).get();
			if (emp == null) {
				mv.addObject("msg", "Employee object not found ");
			} else {
				mv.addObject("Emp", emp);
			}
		} catch (Exception e) {
			mv.addObject("msg", "Employee object not found");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);

		return mv;

	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView loadFindEmployeeByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		try {
			List<Employee> emp = dao.findByEname(ename);
			if (emp == null) {
				mv.addObject("msg", "Employee object not found ");
			} else {
				mv.addObject("Emp", emp);
			}
		} catch (Exception e) {
			mv.addObject("msg", "Employee object not found");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);

		return mv;

	}

	@RequestMapping("/UpdateEmployee")
	public ModelAndView LoadUpdateEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/fetchEmployee")
	public ModelAndView Loadfetch(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");

		Employee emp = dao.findById(eid).get();

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);

		mv.addObject("Emp", emp);
		return mv;

	}

	@RequestMapping("/PerformUpdate")
	public ModelAndView doUpdate(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee Object Updated");
		} catch (Exception e) {
			mv.addObject("msg", "Employee object not Updated");
		}

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/FindAllEmployee")
	public ModelAndView LoadFindAll(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");
		List<Employee> emp = (List<Employee>) dao.findAll();

		mv.addObject("Emp", emp);
		return mv;
	}

	@RequestMapping("/EditorDelete")
	public ModelAndView LoadEditDelete(@RequestParam("emsbutton") String btn, Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");

		if (btn.equals("Edit")) {
			dao.save(employee);

		} else if (btn.equals("Delete")) {
			dao.deleteById(employee.getEid());
		}

		List<Employee> emp = (List<Employee>) dao.findAll();

		mv.addObject("Emp", emp);
		return mv;
	}
	
	@GetMapping("/")

	@RequestMapping("/Add")
	public ModelAndView LoadAddEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");
		try {
			if (employee != null) {
				dao.save(employee);
			}
		} catch (Exception e) {
			System.out.println(e);

		}

		List<Employee> emp = (List<Employee>) dao.findAll();

		mv.addObject("Emp", emp);

		return mv;
	}

}