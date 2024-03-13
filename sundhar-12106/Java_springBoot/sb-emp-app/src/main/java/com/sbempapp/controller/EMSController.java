package com.sbempapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sbempapp.bean.Employee;
import com.sbempapp.dao.EmployeeDAO;

import jakarta.ws.rs.GET;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	@GetMapping
	public ModelAndView loadPage() {
		return new ModelAndView("LandingPage");
	}

	@GetMapping("Links")
	public ModelAndView loadLinksPage() {
		return new ModelAndView("links");
	}

	@GetMapping("View")
	public ModelAndView loadInsertPage() {

//		List<Integer> idList = dao.getIdList();
//		System.out.println("ID List : " + idList);
		return new ModelAndView("Insert");
	}

	@GetMapping("Insert")
	public ModelAndView loadInsertPageFromLink() {
		return new ModelAndView("Insert");
	}

	@GetMapping("Update")
	public ModelAndView loadUpdatePageFromLink() {
		List<Integer> ls = dao.getIdList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("ls", ls);
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView loadDeletePageFromLink() {
		List<Integer> ls = dao.getIdList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("ls", ls);
		return mv;
	}

	@GetMapping("Find")
	public ModelAndView loadFindPageFromLink() {
		List<Integer> ls = dao.getIdList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("Save")
	public ModelAndView loadSave(Employee employee) {

		System.out.println(employee);
		ModelAndView mv = new ModelAndView("Insert");
		employee = dao.saveEmployee(employee);
		if (employee != null)
			mv.addObject("result", "Success");
		else
			mv.addObject("result", "Failure");
		return mv;
	}

	@PostMapping("GetEmp")
	public ModelAndView getEmployeByupdate(@RequestParam("empId") int id) {
		ModelAndView mv = new ModelAndView("Update");
		List<Integer> ls = null;
		try {
			Employee employee = dao.getEmployee(id);
			ls = dao.getIdList();
			mv.addObject("emp", employee);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("UpdateEmp")
	public ModelAndView performUpdateByUpdate(Employee employee) {
		ModelAndView mv = new ModelAndView("Delete");
		List<Integer> ls = null;
		try {
			System.out.println(employee);
			dao.updateEmployee(employee);
			ls = dao.getIdList();
			mv.addObject("result", "Success");
		} catch (Exception e) {
			// TODO: handle exception
			mv.addObject("result", "Failure");
		}

		return mv;
	}

	@PostMapping("GetEmpFind")
	public ModelAndView getEmployeByFind(@RequestParam("empId") int id) {
		ModelAndView mv = new ModelAndView("Find");
		List<Integer> ls = null;
		try {
			Employee employee = dao.getEmployee(id);
			ls = dao.getIdList();
			mv.addObject("emp", employee);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("GetEmpDelete")
	public ModelAndView getEmployeByDelete(@RequestParam("empId") int id) {
		ModelAndView mv = new ModelAndView("Delete");
		List<Integer> ls = null;
		try {
			Employee employee = dao.getEmployee(id);
			ls = dao.getIdList();
			mv.addObject("emp", employee);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		mv.addObject("ls", ls);
		return mv;
	}

	@PostMapping("DeleteEmpDel")
	public ModelAndView performDeleteByDel(Employee employee) {
		ModelAndView mv = new ModelAndView("Delete");
		List<Integer> ls = null;
		try {
			System.out.println(employee);
			dao.deleteEmployee(employee);
			ls = dao.getIdList();
			mv.addObject("result", "Success");
		} catch (Exception e) {
			// TODO: handle exception
			mv.addObject("result", "Failure");
		}

		return mv;
	}

	// fetch By name operation
	@GetMapping("FindName")
	public ModelAndView loadFindNamePage() {
		ModelAndView mv = new ModelAndView("FindName");
		List<String> ls = null;
		try {
			ls = dao.getEmployeeNames();
			mv.addObject("ls", ls);
		} catch (Exception e) {
			mv.addObject("res", "failure");
		}
		return mv;
	}

	@PostMapping("GetEmpName")
	public ModelAndView loadEmployeeFindByName(@RequestParam("empName") String name) {
		ModelAndView mv = new ModelAndView("FindName");
		List<String> ls = null;
		try {
			List<Employee> employeeList = dao.getEmployeesByName(name);
			ls = dao.getEmployeeNames();
			mv.addObject("ls", ls);
			mv.addObject("empls", employeeList);
		} catch (Exception e) {
			mv.addObject("res", "failure");
		}
		return mv;
	}

	@GetMapping("DeleteName")
	public ModelAndView loadDeleteByNamePage() {

		ModelAndView mv = new ModelAndView("DeleteName");
		List<String> ls = null;
		try {
			ls = dao.getEmployeeNames();
			mv.addObject("ls", ls);
		} catch (Exception e) {
			mv.addObject("res", "failure");
		}
		return mv;
	}

	@PostMapping("DelEmpName")
	public ModelAndView deleteEmployeeFromDeleteByName(@RequestParam("empName") String name) {

		System.out.println("delete controller : " + name);
		ModelAndView mv = new ModelAndView("DeleteName");
		List<String> ls = null;
		try {
			name = dao.deleteEmployeeByName(name);
			ls = dao.getEmployeeNames();
			mv.addObject("ls", ls);
			mv.addObject("result", name);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
			mv.addObject("result", "Failure");
		}
		return mv;
	}

	// fetchAll loading
	@GetMapping("FindAll")
	public ModelAndView getFetchAllPage() {
		ModelAndView mv = new ModelAndView("FindAll");
		try {

			List<Employee> empls = dao.getAllRecord();
			mv.addObject("empls", empls);

		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		return mv;
	}

	// update request from find All //FA-> Find All page

	@GetMapping("EditFA")
	public ModelAndView loadInputFA(@RequestParam("id") int id) {

		ModelAndView mv = new ModelAndView("FindAll");
		try {

			List<Employee> empls = dao.getAllRecord();
			mv.addObject("empls", empls);
			mv.addObject("id", id);
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		return mv;
	}

	@PostMapping("UpdateFA")
	public ModelAndView loadFAUpdate(@RequestParam("id") int id ,Employee employee) {

		ModelAndView mv = new ModelAndView("FindAll");
		System.out.println("id : "+id +" : employee "+employee);
		try {
			dao.updateEmpoyeeById(id, employee);
			List<Employee> empls = dao.getAllRecord();
			mv.addObject("empls", empls);

		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		return mv;
	}
	
	@GetMapping("DeleteFA")
	public ModelAndView getFetchAllADelete(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("FindAll");
		try {
			dao.deleteById(id);
			List<Employee> empls = dao.getAllRecord();
			mv.addObject("empls", empls);

		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("res", "failure");
		}
		return mv;
	}

}
