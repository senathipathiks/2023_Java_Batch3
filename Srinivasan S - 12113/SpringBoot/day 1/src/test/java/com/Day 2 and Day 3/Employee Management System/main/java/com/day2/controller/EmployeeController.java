package com.day2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.day2.bean.Employee;
import com.day2.dao.EmployeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@GetMapping("/index")
	public ModelAndView loadIndex() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	
	@GetMapping("NavLink")
	public ModelAndView loadLink() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("NavLink");
		return mv;
	}
	
	@GetMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	
	@GetMapping("Add")
	public ModelAndView loadAdd() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Add");
		return mv;
	}
	
	@GetMapping("Insertion")
	public ModelAndView doAdd(Employee emp) {		
		ModelAndView mv=new ModelAndView();
		mv.addObject("emp",emp);
		mv.setViewName("addsuccess");
		repo.save(emp);	
		return mv;
	}
	
	@GetMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv=new ModelAndView();
		List<Integer>list=repo.getIdList();		
		mv.addObject("idList",list);
		mv.setViewName("Delete");
		return mv;
	}
	
	@GetMapping("Deletion")
	public ModelAndView doDelete(@RequestParam("eid") int eid) {		
		ModelAndView mv=new ModelAndView();
		repo.deleteById(eid);
		mv.setViewName("deletesuccess");
			
		return mv;
	}
	
	@GetMapping("Search")
	public ModelAndView loadSearch() {
		ModelAndView mv=new ModelAndView();
		List<Integer>list=repo.getIdList();		
		mv.addObject("idList",list);
		mv.setViewName("Search");
		return mv;
	}
	
	@GetMapping("Searches")
	public ModelAndView doSearch(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView();
		
		Employee emp=repo.findById(eid).get();
		mv.addObject("emp",emp);
		mv.setViewName("searchsuccess");
		return mv;
	}
	
	@GetMapping("SearchName")
	public ModelAndView loadSearchName() {
		ModelAndView mv=new ModelAndView();
		
		List<String>list=repo.getNameList();
		mv.addObject("idList",list);
		mv.setViewName("SearchName");
		return mv;
		
	}
	
	@GetMapping("SearchByName")
	public ModelAndView doSearchByName(@RequestParam("ename")String ename) {
		ModelAndView mv=new ModelAndView();
		
		List<Employee> emp =  repo.findByEname(ename);
		mv.addObject("emp", emp);
		mv.setViewName("searchsuccess");
		
		return mv;
	}
	
	@GetMapping("DeleteName")
	public ModelAndView loadDeleteName() {
		ModelAndView mv=new ModelAndView();
		
		List<String>list=repo.getNameList();	
		
		mv.addObject("idList",list);
		mv.setViewName("DeleteName");
		return mv;
	}
	
	@GetMapping("DeletionByName")	
	public ModelAndView doDeleteName(@RequestParam("ename") String ename) {		
		ModelAndView mv=new ModelAndView();
		
		List<String>list=repo.getNameList();
		System.out.println(ename);
		repo.deleteByEname(ename);
//		mv.addObject("idList",list);
		
		mv.setViewName("deletesuccess");		
				
		return mv;
	}
	
	@GetMapping("Update")
	public ModelAndView loadUpdate() {
		ModelAndView mv=new ModelAndView();
		
		List<Integer>list=repo.getIdList();		
		mv.addObject("idList",list);
		mv.setViewName("Update");
		return mv;
	}
	
	@GetMapping("Fetch")
	public ModelAndView doFetch(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView();
		List<Integer>list=repo.getIdList();	
		Employee emp=repo.findById(eid).get();
		mv.addObject("emp",emp);
		mv.addObject("idList",list);
		mv.setViewName("Update");
		
		return mv;
		
	}
	
	@GetMapping("Updation")
	public ModelAndView doUpdation(Employee emp) {
		ModelAndView mv=new ModelAndView();
		List<Integer>list=repo.getIdList();	
		repo.save(emp);
		mv.addObject("emp",emp);
		mv.addObject("idList",list);
		mv.setViewName("updatesuccess");
		
		return mv;
		
	}
	
	@GetMapping("FindAll")
	public ModelAndView loadFindall() {
		ModelAndView mv=new ModelAndView();
		Iterable<Employee>list=repo.findAll();
		mv.addObject("Idlist",list);
		mv.setViewName("FindAll");
		
		return mv;
		
	}
	
	@GetMapping("Save")
	public ModelAndView doSave(Employee emp) {
		ModelAndView mv=new ModelAndView();
		repo.save(emp);
		mv.addObject("Idlist",repo.findAll());
		mv.setViewName("FindAll");
		
		return mv;
	}
	
	@GetMapping("EditForm")
	public ModelAndView doEdit(Employee emp) {
		ModelAndView mv=new ModelAndView();
		List<Integer>list=repo.getIdList();	
		repo.save(emp);
		mv.addObject("emp",emp);
		mv.addObject("Idlist",repo.findAll());
		mv.setViewName("FindAll");
		
		return mv;
		
	}
	
	@GetMapping("Remove")
	public ModelAndView doRemove(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView();
		
		repo.deleteById(eid);
		mv.addObject("Idlist",repo.findAll());
		mv.setViewName("FindAll");
		return mv;
	}
	
}
