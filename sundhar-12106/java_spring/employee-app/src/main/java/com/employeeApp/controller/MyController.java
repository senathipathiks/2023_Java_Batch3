package com.employeeApp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employeeApp.dao.EmployeeDAO;
import com.employeeApp.dto.Employee;

@Controller
@ComponentScan(basePackages = { "com.employeeApp.dao", "com.employeeApp.util" })
public class MyController {

	@Autowired
	EmployeeDAO dao;

	@GetMapping("links")
	public ModelAndView index() {
		System.out.println("hello from controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("links");

		return mv;
	}

	@GetMapping("Insert")
	public ModelAndView getInsertPage() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}

	@PostMapping("save")
	public ModelAndView saveReq(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("Insert");
		int n = dao.saveEmployee(employee);

		if (n == 1)
			mv.addObject("result", "Success");
		else
			mv.addObject("result", "Failure");

		return mv;
	}

	@GetMapping("Find")
	public ModelAndView getFindPage() {
		ModelAndView mv = new ModelAndView("Find");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		mv.addObject("ls", ls);
		return mv;

	}

	@PostMapping("findById")
	public ModelAndView findById(@ModelAttribute("employee") Employee emp) {

		ModelAndView mv = new ModelAndView("Find");
		System.out.println(emp + "start");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		emp = dao.fetchById(emp);
		System.out.println("after fetch " + emp);
		mv.addObject("ls", ls);
		mv.addObject("emp", emp);
		return mv;
	}

	@GetMapping("Update")
	public ModelAndView getUpdate() {
		ModelAndView mv = new ModelAndView("Update");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		mv.addObject("ls", ls);
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView getDelete() {
		ModelAndView mv = new ModelAndView("Delete");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("updateById")
	public ModelAndView updateById(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("Update");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		employee = dao.fetchById(employee);
		mv.addObject("emp", employee);
		mv.addObject("ls", ls);

		return mv;
	}

	@PostMapping("updateEmp")
	public ModelAndView empUpdate(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("Update");

		System.out.println(employee);
		employee = dao.updateById(employee);

		if (employee != null)
			mv.addObject("result", "Success");
		else
			mv.addObject("result", "Failure");

		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("delFind")
	public ModelAndView findDelEmp(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("Delete");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		employee = dao.fetchById(employee);
		mv.addObject("emp", employee);
		mv.addObject("ls", ls);

		return mv;
	}

	@PostMapping("delEmp")
	public ModelAndView delEmp(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("Delete");
		ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
		System.out.println(ls);
		mv.addObject("ls", ls);
		System.out.println(employee);

		int n = dao.deleteEmp(employee);
		if (n == 1)
			mv.addObject("result", "Success");
		else
			mv.addObject("result", "Failure");

		return mv;
	}

	@GetMapping("FindAll")
	public ModelAndView getAllEmp() {

		ModelAndView mv = new ModelAndView("FetchAll");
		ArrayList<Employee> empls = (ArrayList<Employee>) dao.fetchAll();
		mv.addObject("ls", empls);

		return mv;
	}

	@PostMapping("upFAll")
	public ModelAndView findAllupdate(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("FetchAll");
		System.out.println(employee + " from upfall");
		dao.updateById(employee);
		ArrayList<Employee> empls = (ArrayList<Employee>) dao.fetchAll();
		mv.addObject("ls", empls);
//		mv.addObject("ids", employee.getEid());

		return mv;

	}
	
	@GetMapping("Edit")
	public ModelAndView editFindAll(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("FetchAll");
//		System.out.println(employee + " from upfall");
//		dao.updateById(employee);
		System.out.println("hello" +id);
		ArrayList<Employee> empls = (ArrayList<Employee>) dao.fetchAll();
		mv.addObject("ls", empls);
		mv.addObject("ids", id);
		return mv;
	}

	@GetMapping("upDel")
	public ModelAndView findAllDelete(@RequestParam("id") int id) {

		ModelAndView mv = new ModelAndView("FetchAll");
		System.out.println(id);
		Employee emp = new Employee();
		emp.setEid(id);
		dao.deleteEmp(emp);
		ArrayList<Employee> empls = (ArrayList<Employee>) dao.fetchAll();
		mv.addObject("ls", empls);

		return mv;
	}

	@PostMapping("findAllInsert")
	public ModelAndView findAllSaveReq(@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView("FetchAll");
		int n = dao.saveEmployee(employee);

		if (n == 1)
			mv.addObject("result", "Success");
		else
			mv.addObject("result", "Failure");

		ArrayList<Employee> empls = (ArrayList<Employee>) dao.fetchAll();
		mv.addObject("ls", empls);

		return mv;
	}

}
