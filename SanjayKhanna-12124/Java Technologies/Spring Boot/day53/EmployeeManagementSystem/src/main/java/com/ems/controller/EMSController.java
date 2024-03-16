package com.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@Controller
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	@GetMapping("/start")
	public ModelAndView loadIndexPage() {
		return new ModelAndView("Index");
	}

	@GetMapping("HeadingPage")
	public ModelAndView loadHeadingPage() {
		return new ModelAndView("HeadingPage");
	}

	@GetMapping("Insert")
	public ModelAndView loadInsert() {
		return new ModelAndView("Insert");
	}

	@GetMapping("Delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("Delete");
	}

	@GetMapping("Search")
	public ModelAndView loadSearch() {
		return new ModelAndView("Search");
	}

	@GetMapping("Update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("Update").addObject("idList", dao.getIdList());
	}
	
	@GetMapping("Home")
	public ModelAndView loadHome() {
		return new ModelAndView("Home").addObject("EmpList", (ArrayList<Employee>)dao.findAll());
	}

	@PostMapping("InsertEmployee")
	public ModelAndView doInsert(Employee emp) {
		ModelAndView mv = new ModelAndView("Insert");

		try {
			dao.save(emp);
			mv.addObject("msg", "success");
		} catch (Exception e) {
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@RequestMapping("DeleteOption")
	public ModelAndView getOptionForDelete(@RequestParam("option") String option) {
		ModelAndView mv = new ModelAndView("Delete");
		if (option.equals("name")) {
			mv.addObject("nameList", dao.getNameList());
			mv.addObject("opt", "Name");
		} else if (option.equals("salary")) {
			mv.addObject("salaryList", dao.getSalaryList());
			mv.addObject("opt", "Salary");
		} else {
			mv.addObject("idList", dao.getIdList());
			mv.addObject("opt", "Id");
		}
		return mv;
	}

	@RequestMapping("SearchOption")
	public ModelAndView getOptionForSearch(@RequestParam("option") String option) {
		ModelAndView mv = new ModelAndView("Search");
		if (option.equals("name")) {
			mv.addObject("nameList", dao.getNameList());
			mv.addObject("opt", "Name");
		} else if (option.equals("salary")) {
			mv.addObject("salaryList", dao.getSalaryList());
			mv.addObject("opt", "Salary");
		} else {
			mv.addObject("idList", dao.getIdList());
			mv.addObject("opt", "Id");
		}
		return mv;
	}

	@PostMapping("DeleteEmployeeById")
	public ModelAndView doDeleteById(@RequestParam("empId") Integer id) {
		ModelAndView mv = new ModelAndView("Delete");
		try {
			dao.deleteById(id);
			mv.addObject("msg", "success");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("DeleteEmployeeByName")
	public ModelAndView doDeleteByName(@RequestParam("empName") String name) {
		ModelAndView mv = new ModelAndView("Delete");
		try {
			dao.deleteByEmpName(name);
			mv.addObject("msg", "success");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("DeleteEmployeeBySalary")
	public ModelAndView doDeleteBySalary(@RequestParam("empSalary") float salary) {
		ModelAndView mv = new ModelAndView("Delete");
		try {
			dao.deleteByEmpSalary(salary);
			mv.addObject("msg", "success");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("SearchEmployeeById")
	public ModelAndView doSearchById(@RequestParam("empId") int id) {
		ModelAndView mv = new ModelAndView("Search");
		try {
			Employee emp = dao.getEmployeeById(id);
			mv.addObject("msg", "success").addObject("bean", emp);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("SearchEmployeeByName")
	public ModelAndView doSearchByName(@RequestParam("empName") String name) {
		ModelAndView mv = new ModelAndView("Search");
		try {
			List<Employee> emp = dao.getEmployeeByName(name);
			mv.addObject("msg", "success").addObject("beanList", emp);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("SearchEmployeeBySalary")
	public ModelAndView doSearchBySalary(@RequestParam("empSalary") float salary) {
		ModelAndView mv = new ModelAndView("Search");
		try {
			List<Employee> emp = dao.getEmployeeBySalary(salary);
			mv.addObject("msg", "success").addObject("beanList", emp);
		} catch (Exception e) {
			mv.addObject("msg", "failure");
		}
		return mv;
	}

	@PostMapping("fetch")
	public ModelAndView doFetch(@RequestParam("empId") int id) {
		ModelAndView mv = new ModelAndView("Update");
		try {
			Employee emp = dao.getEmployeeById(id);
			mv.addObject("idList", dao.getIdList()).addObject("bean", emp);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("idList", dao.getIdList());
		}
		return mv;
	}

	@PostMapping("UpdateEmployee")
	public ModelAndView doUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView("Update");

		try {
			dao.save(emp);
			mv.addObject("msg", "success").addObject("idList", dao.getIdList());
		} catch (Exception e) {
			mv.addObject("msg", "failure").addObject("idList", dao.getIdList());
		}
		return mv;
	}
	
	@GetMapping("findall")
	public ModelAndView doAction(@RequestParam("action") String action,@RequestParam("empId")int id) {
		
		if(action.equals("edit")) {
	
			return new ModelAndView("Home").addObject("EmpList",dao.findAll()).addObject("bean", dao.findById(id).get());
			
		}else if(action.equals("delete")) {
			dao.deleteById(id);;
			return new ModelAndView("Home").addObject("EmpList",dao.findAll());
		}
		
		return new ModelAndView("Home").addObject("EmpList",dao.findAll());
		
	}
	
	@PostMapping("SaveUpdate")
	public ModelAndView doSave(Employee emp) {
		dao.save(emp);
		return new ModelAndView("Home").addObject("EmpList",dao.findAll());
	}
	
	@GetMapping("back")
	public ModelAndView doBack() {
		return new ModelAndView("Home").addObject("EmpList",dao.findAll());
	}
	
	@PostMapping("AddEmployee")
	public ModelAndView doAdd(Employee emp) {
		dao.save(emp);
		return new ModelAndView("Home").addObject("EmpList",dao.findAll());
	}

}
