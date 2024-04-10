package com.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EMSController {

	@Autowired // easily plug and unplugable
	EmployeeDAO dao;

	@RequestMapping("/start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView("LandingPage");
		// mv.setViewName("LandingPage");
		return mv;

	}

	@RequestMapping("/links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("links");
		return mv;
	}

	@RequestMapping("/home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping("/insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("insert");
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("delete");
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/deleteemployeebyname")
	public ModelAndView loadDeleteName() {
		ModelAndView mv = new ModelAndView("deleteEmployeeByName");
		ArrayList<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/findemployee")
	public ModelAndView findEmployee() {
		ModelAndView mv = new ModelAndView("findEmployee");
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/findAll")
	public ModelAndView performFindAllEmployee() {
		ModelAndView mv = new ModelAndView("findAllEmployee");
		ArrayList<Employee> idList = (ArrayList<Employee>) dao.findAll();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/findemployeebyname")
	public ModelAndView findEmployeeByName() {
		ModelAndView mv = new ModelAndView("findEmployeeByName");
		ArrayList<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/updateemployee")
	public ModelAndView findAllEmployee() {
		ModelAndView mv = new ModelAndView("updateEmployee");
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/performAddition")
	public ModelAndView performInsert(Employee employee) {
		ModelAndView mv = new ModelAndView("insert");
		try {
			dao.save(employee);// it will perform as create also update,if the primary value is same
			mv.addObject("msg", "Employee Object Saved");
		} catch (Exception e) {

			mv.addObject("msg", "Employee Object Not Saved");
		}
		return mv;
	}

	@RequestMapping("/performDelete")
	public ModelAndView deleteEmployee(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView("delete");

		try {
			dao.deleteById(eid);
			mv.addObject("msg", "Employee Details Deleted Successfully");
		} catch (Exception e) {

			mv.addObject("msg", "Employee Details Not Found");
		}
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/performDeleteByName")
	public ModelAndView deleteEmployeeByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView("deleteEmployeeByName");

		try {
			dao.deleteByEname(ename);
			mv.addObject("msg", "Employee Details Deleted Successfully");
		} catch (Exception e) {

			mv.addObject("msg", "Employee Details Not Found");
		}
		ArrayList<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/performFind")
	public ModelAndView performFind(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView("findEmployee");

		try {
			Employee empList = dao.findById(eid).get();
			mv.addObject("record", empList);

//			if(empList==null) {
//				mv.addObject("msg", "Employee Details Not Found");
//			}else {
//				mv.addObject("EmpList",empList);
//			}

		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Not Found");
		}
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/performFindByName")
	public ModelAndView performFindByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView("findEmployeeByName");
		try {
			ArrayList<Employee> list = dao.findByEname(ename);
			mv.addObject("emplist", list);

		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Not Found");
		}
		ArrayList<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/fetchUpdate")
	public ModelAndView performUpdate(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView("updateEmployee");
		try {
			Employee empList = dao.findById(eid).get();
			mv.addObject("record", empList);

		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Not Found");

		}
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;

	}

	@RequestMapping("/UpdateEmployee")
	public ModelAndView updateEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("updateEmployee");
		try {
			dao.save(employee);// it will perform as create also update,if the primary value is same
			mv.addObject("msg", "Employee Object Saved");
		} catch (Exception e) {

			mv.addObject("msg", "Employee Object Not Saved");
		}
		ArrayList<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);

		return mv;
	}

	@RequestMapping("/performEdit")
	public ModelAndView editEmployee(@RequestParam("emsBtn") String btn, Employee employee) {
		ModelAndView mv = new ModelAndView("findAllEmployee");
		if (btn.equals("Edit")) {
			dao.save(employee);
		} else if (btn.equals("Delete")) {
			dao.deleteById(employee.getEid());
		}
		ArrayList<Employee> idList = (ArrayList<Employee>) dao.findAll();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/performAdd")
	public ModelAndView performadd(Employee employee) {
		ModelAndView mv = new ModelAndView("findAllEmployee");
		try {
			dao.save(employee);// it will perform as create also update,if the primary value is same

		} catch (Exception e) {

			mv.addObject("msg", "Table is Empty");
		}
		ArrayList<Employee> idList = (ArrayList<Employee>) dao.findAll();
		mv.addObject("IdList", idList);
		return mv;
	}

}
