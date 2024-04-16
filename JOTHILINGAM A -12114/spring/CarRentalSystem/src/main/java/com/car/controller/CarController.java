package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.car.DAO.carDao;
import com.car.bean.Car;







@Controller
public class CarController {

	@Autowired
	carDao dao;

	@RequestMapping("banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("banner");
		return mv;
	}

	@RequestMapping("Link1")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Link1");
		return mv;
	}

	@RequestMapping("insert")
	public ModelAndView loadInsertStudent() {
		
		ModelAndView mv = new ModelAndView("insert");
		
		System.out.println("button");
		
		return mv;
	}

	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Car bean) {
		System.out.println("hi");
		dao.insert(bean);
		ModelAndView mv = new ModelAndView("insertsuccess");
		mv.addObject("bean", bean);
		return mv;

	}
	
	
	@RequestMapping("delete")
	public ModelAndView loadDeleteStudent()
	{
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idlist",list);
		return mv;
	}

	
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Car bean)
	{
	System.out.println(bean);
	List<Integer> list = dao.idList();
	dao.delete(bean);
	ModelAndView mv = new ModelAndView("deletesuccess");
	mv.addObject("idlist",list);
	//mv.addObject("bean",bean);
	return mv;	
	}
	
	
	@RequestMapping("update")
	public ModelAndView loadUpdateStudent()
	{
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("idlist",list);
		return mv;
	}

	@RequestMapping("fetch")
	public ModelAndView loadFetch(@ModelAttribute("bean")Car c1){
		
		int id = c1.getCarID();
		Car c2 = dao.fetchMethod(id);
		System.out.println(c2);
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("c",c2);
		System.out.println();
		return mv;
		
	}		
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Car bean)
	{
	
	dao.update(bean);
	List<Integer> list = dao.idList();
	ModelAndView mv = new ModelAndView("updatesuccess");
	//mv.addObject("bean",bean);
	mv.addObject("idlist",list);
	return mv;
	}
	
	@RequestMapping("view")
	public ModelAndView loadView(@ModelAttribute("bean")Car bean)
	{
		ModelAndView mv = new ModelAndView("view");
	
		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView loadViewStudent(@ModelAttribute("bean")Car bean)
	{
			int id = bean.getCarID();
		Car list = dao.fetchMethod(id);
		System.out.println(list);
		ModelAndView mv = new ModelAndView("findsuccess");
		mv.addObject("c",list);
		return mv;
	}
	
	@RequestMapping("viewall")
	public ModelAndView loadFindAll() {
		
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("idlist",list);
		mv.addObject("msg","FindAll");
		return mv;
	}
	
	@RequestMapping("Edit")
	public ModelAndView loadedit(@ModelAttribute("rdata")Car emp) {
		
		int id = emp.getCarID();
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("id",id);
		mv.addObject("msg","Edit");
		return mv;
	}
	
	@RequestMapping("Save")
	public ModelAndView doEdit(@ModelAttribute("data")Car emp) {
		
		dao.update(emp);
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("msg","viewall");
		return mv;
	}
	
	@RequestMapping("Remove")
	public ModelAndView doRemove(@ModelAttribute("rdata")Car emp) {
		
		dao.delete(emp);;
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("msg","viewall");
		return mv;
	}
	
	@RequestMapping("NewElem")
	public ModelAndView loadNew() {
		
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("msg","New");
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping("New")
	public ModelAndView doNew(@ModelAttribute("bean")Car emp) {
		
		dao.insert(emp);
		List<Car> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("msg","viewall");
		mv.addObject("list",list);
		return mv;
	}
	
	
	@RequestMapping("Search")
	public ModelAndView doFind(@ModelAttribute("bean")Car bean)
	{	
	Car c = dao.viewStudent(bean);
	ModelAndView mv = new ModelAndView("search");
	mv.addObject("bean", c);
	return mv;
	}
	
	

	 

}
