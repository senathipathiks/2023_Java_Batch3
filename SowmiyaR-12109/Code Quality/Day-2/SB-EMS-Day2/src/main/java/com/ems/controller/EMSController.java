package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ModelAndView Links() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}

	@RequestMapping("/InsertEmployee")
	public ModelAndView Insert() {
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
			mv.addObject("msg", "Employee Object Saved");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Saved");
		}
		return mv;
	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView Delete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
//		System.out.println(idList);
		return mv;
	}

	@RequestMapping("/PerformDelete")
//	public ModelAndView performDelete(Employee employee) {
	public ModelAndView performDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");

		try {
//		dao.delete(employee);
//		dao.deleteById(employee.getEid());
			dao.deleteById(eid);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/DeleteEmployeeName")
	public ModelAndView DeleteName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeName");

		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		System.out.println(nameList);
		return mv;
	}

	@RequestMapping("/PerformDeleteName")
	public ModelAndView performDeleteName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeName");

		try {
			dao.deleteByEname(ename);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/DeleteEmployeeSalary")
	public ModelAndView DeleteSalary() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeSalary");

		List<Integer> salaryList = dao.getSalaryList();
		mv.addObject("SalaryList", salaryList);
		return mv;
	}

	@RequestMapping("/PerformDeleteSalary")
	public ModelAndView performDeleteSalary(@RequestParam("esalary") int esalary) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployeeSalary");

		try {
			dao.deleteByEsalary(esalary);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted");
		}
		List<Integer> salaryList = dao.getSalaryList();
		mv.addObject("SalaryList", salaryList);
		return mv;
	}

	@RequestMapping("/FindEmployee")
	public ModelAndView FindEmployee() {
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

		try {
			Employee emp = dao.findById(eid).get();
			if (emp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			} else {
				mv.addObject("Emp", emp);
			}

		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Found");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}

	@RequestMapping("/FindName")
	public ModelAndView FindName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindName");

		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView performFindName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindName");

		try {
			Employee emp = dao.findByEname(ename).get(0);
			if (emp == null) {
				mv.addObject("msg", "Employee Object Not Found");
			} else {
				mv.addObject("Emp", emp);
			}

		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Found");
		}
		List<String> nameList = dao.getNameList();
		mv.addObject("NameList", nameList);
		return mv;
	}
	
	@RequestMapping("/UpdateEmployee")
	public ModelAndView UpdateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");

		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		return mv;
	}
	
	@RequestMapping("/FetchEmployee")
	public ModelAndView FetchEmployee(@RequestParam("eid")int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");

		Employee emp=dao.findById(eid).get();
		
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		mv.addObject("Emp", emp);
		return mv;
	}
	
	@RequestMapping("/PerformUpdate")
	public ModelAndView UpdateEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
        try {
		dao.save(employee);
		mv.addObject("msg","Employee Object Updated");
        }catch(Exception e) {
        mv.addObject("msg","Employee Object Not Updated");	
        }
		List<Integer> idList = dao.getIdList();
		mv.addObject("IdList", idList);
		
		return mv;
	}
	
	@GetMapping("FindAllEmployee")
	public ModelAndView loadFindAllEmployee() {
		ModelAndView mv=new ModelAndView();
		List<Employee> empList=(List<Employee>) dao.findAll();
		mv.addObject("beanList", empList);
		mv.setViewName("FindAllEmployee");
		return mv;
		}

	@RequestMapping("/Insert")
	public ModelAndView doInsert(Employee employee) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.save(employee);
		mv.addObject("beanList",dao.findAll());
		mv.setViewName("FindAllEmployee");
		}catch(Exception e) {
			mv.addObject("msg", "Employee Object Not Inserted");
		}
		return mv;
	}
	@RequestMapping("/Edit")
	public ModelAndView doEdit(Employee employee) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.save(employee);
		mv.addObject("beanList",dao.findAll());
		mv.setViewName("FindAllEmployee");
		}catch(Exception e) {
			mv.addObject("msg", "Employee Object Not Inserted");
		}
		return mv;
	}
	@RequestMapping("/Remove")
	public ModelAndView doRemove(Employee employee) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.delete(employee);
		mv.addObject("beanList",dao.findAll());
		mv.setViewName("FindAllEmployee");
		}catch(Exception e) {
			mv.addObject("msg", "Employee Object Not Inserted");
		}
		return mv;
	}
	

}
