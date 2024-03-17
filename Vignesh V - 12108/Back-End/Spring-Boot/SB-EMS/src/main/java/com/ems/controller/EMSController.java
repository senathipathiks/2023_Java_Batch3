package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeRepo;

//@Controller
public class EMSController {

	@Autowired
	EmployeeRepo dao;

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
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		return mv;
	}

	@RequestMapping("/performInsert")
	public ModelAndView performinsert(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee object saved");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object not saved");

		}
		return mv;
	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView deleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");

		List<Integer> idlist = dao.getIdList();
		mv.addObject("idlist", idlist);
		return mv;
	}

	@RequestMapping("/PerfromDelete")
	public ModelAndView performDelete(@RequestParam("empId") int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		try {
			dao.deleteById(empId);
			mv.addObject("msg", "Employee object Deleted");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object not Deleted");

		}
		List<Integer> idlist = dao.getIdList();
		mv.addObject("idlist", idlist);
		return mv;

	}

	@RequestMapping("/DeleteEmployeeByName")
	public ModelAndView deleteEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeByName");

		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		System.out.println(nameList);

		return mv;

	}

	@RequestMapping("/PerfromDeleteByName")
	public ModelAndView performDeleteByName(@RequestParam("empName") String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeByName");
		try {
			dao.deleteByEmpName(empName);
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
	public ModelAndView FindEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		System.out.println(idList);

		return mv;
	}

	@RequestMapping("/performFind")
	public ModelAndView performFind(@RequestParam("empId") int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		try {
			Employee emp = dao.findById(empId).get();
			if (emp == null) {
				mv.addObject("msg", "Employee object Not Found");
			} else {
				mv.addObject("Emp", emp);

			}

		} catch (Exception e) {
			mv.addObject("msg", "Employee object not found");

		}
		List<Integer> idlist = dao.getIdList();
		mv.addObject("Idlist", idlist);
		return mv;

	}

	@RequestMapping("FindEmployeeByName")
	public ModelAndView loadFindName() {
		ModelAndView mv = new ModelAndView();
		List<String> nameList = dao.getEmpName();
		mv.setViewName("FindEmployeeByName");
		System.out.println(nameList);
		mv.addObject("nameList", nameList);
		return mv;
	}

	@PostMapping("PerformFindName")
	public ModelAndView performFind(@RequestParam("empName") String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		try {
			List<Employee> empList = dao.findByEmpName(empName);

			if (empList == null) {
				mv.addObject("msg", "Record Not Found");
			} else {
				mv.addObject("empList", empList);
				List<String> nameList = dao.getNameList();
				mv.addObject("nameList", nameList);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}

	@RequestMapping("/UpdateEmployee")
	public ModelAndView UpdateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		System.out.println(idList);

		return mv;
	}

	@RequestMapping("FetchEmployee")
	public ModelAndView FetchEmployee(@RequestParam("empId") int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");

		Employee emp = dao.findById(empId).get();

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		mv.addObject("emp", emp);
		return mv;
	}

	@GetMapping("PerformUpdate")
	public ModelAndView performUpdate(Employee employee) {
		System.out.println(employee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Successfully Updated");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object not Updated");

		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/ViewAllEmployee")
	public ModelAndView viewallEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewAllEmployee");

		List<Employee> empList = (List<Employee>) dao.findAll();
		System.out.println(empList);
		mv.addObject("EmpList", empList);

		return mv;
	}

	@RequestMapping("/EditOrDelete")
	public ModelAndView editOrDelete(@RequestParam("emsBtn") String btn, Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewAllEmployee");

		if (btn.equals("Edit/Save")) {
			dao.save(employee);
		}
		if (btn.equals("Delete")) {
			dao.deleteById(employee.getEmpId());
		}

		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);

		return mv;
	}
}
