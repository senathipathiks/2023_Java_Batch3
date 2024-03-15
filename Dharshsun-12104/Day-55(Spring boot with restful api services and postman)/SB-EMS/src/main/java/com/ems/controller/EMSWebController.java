package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller //if the controller is comment out it will not to come to this controller to avoid confusion
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
			mv.addObject("msg", "Employee object saved");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object  not saved");
		}
		return mv;
	}
	
	@RequestMapping("/PerfromInsert1")
	public ModelAndView PerfromInsert1(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee object saved");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object  not saved");
		}
		List<Employee> empList= (List<Employee>) dao.findAll();
		 mv.addObject("empList", empList);
		return mv;
	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView DeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);

		return mv;

	}

	@RequestMapping("/FindEmployee")
	public ModelAndView findEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);

		return mv;

	}
	
	@RequestMapping("/FindAllEmployee")
	public ModelAndView findAllEmployee() {
		
		System.out.println("findall");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");

		List<Employee> empList = (List<Employee>) dao.findAll();
		
		
		System.out.println(empList);
		mv.addObject("empList", empList);
//		System.out.println(idList);

		return mv;

	}
	
	
	
	@RequestMapping("/UpdateEmployee")
	public ModelAndView updateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);

		return mv;

	}
	@RequestMapping("/FetchEmployee")
	public ModelAndView fetchEmployee(@RequestParam("empId") int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		
		System.out.println(empId);
		
		Employee emp = dao.findById(empId).get();

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList).addObject("Emp",emp);
//		System.out.println(idList);

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

	@RequestMapping("/FindEmployeeByName")
	public ModelAndView findByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		System.out.println(nameList);

		return mv;

	}

	@RequestMapping("/PerfromDelete")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public ModelAndView PerfromDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		try {
			dao.deleteById(eid);
			mv.addObject("msg", "Employee object deleted");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object  deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("/PerfromFind")
	public ModelAndView performFind(@RequestParam("empId") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		try {
			Employee emp = dao.findById(eid).get();
			if (emp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			} else {
				mv.addObject("Emp",emp);
			}
				
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Found");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("/PerfromUpdate")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public ModelAndView perfromUpdate(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		try {
			dao.save(employee);
			mv.addObject("msg", "Employee object updated");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object not updated");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}
	




	@RequestMapping("/PerfromDeleteByName")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public ModelAndView PerfromDeletename(@RequestParam("empName") String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeByName");
		try {
			dao.deleteByEmpName(empName);
			mv.addObject("msg", "Employee object deleted");

		} catch (Exception e) {
			mv.addObject("msg", "Employee object  deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("PerfromFindByName")
	/* public ModelAndView PerfromDelete(Employee employee) { */
	public ModelAndView PerfromFindname(@RequestParam("empName") String empName) {
		ModelAndView mv = new ModelAndView();
		System.out.println(empName);
		mv.setViewName("FindEmployeeByName");
		try {

			Employee emp = dao.findByEmpName(empName).get(0);
			System.out.println(emp);
			if (emp == null) {
				mv.addObject("msg", "Employee object found");
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
	
	@RequestMapping("EditOrRemove")
	public ModelAndView loadEditRemove(@RequestParam("btn")String button,Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllEmployee");
		
		if(button.equals("Edit")) {
			dao.save(employee);
		}
		if(button.equals("Remove")) {
			dao.deleteById(employee.getEmpId());
		}
		List<Employee> empList= (List<Employee>) dao.findAll();
		 mv.addObject("empList", empList);
		return mv;
	}
}
