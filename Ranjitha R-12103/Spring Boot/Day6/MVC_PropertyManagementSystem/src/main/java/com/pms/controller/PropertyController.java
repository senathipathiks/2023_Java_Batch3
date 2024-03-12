package com.pms.controller;

import org.hibernate.boot.model.source.spi.CascadeStyleSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pms.bean.Property;
import com.pms.dao.PropertyDAO;

@Controller
public class PropertyController {
	@Autowired
	PropertyDAO dao;

	@RequestMapping("Header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("Header");
		return mv;
	}

	@RequestMapping("Home")
	public ModelAndView loadhome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@RequestMapping("links")
	public ModelAndView loadlinks() {
		ModelAndView mv = new ModelAndView("links");
		return mv;
	}
	
	@RequestMapping("About")
	public ModelAndView loadabout() {
		ModelAndView mv=new ModelAndView("About");
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadinsert() {
		return new ModelAndView("Insert");

	}

	@PostMapping("InsertionProp")
	public ModelAndView doInsert(@ModelAttribute("bean") Property prop) {
		int n = dao.insertProperty(prop);

		if (n == 1)
			return new ModelAndView("Insert").addObject("msg", "Record Inserted Successfullly");
		return new ModelAndView("Insert").addObject("msg", "Record Inserted Failure");
	}

	@RequestMapping("Delete")
	public ModelAndView loaddelete() {
		return new ModelAndView("Delete").addObject("key", dao.getIds());
	}

	@PostMapping("DeletionProp")
	public ModelAndView doDelete(@ModelAttribute("bean") Property prop) {
		if (dao.deleteProperty(prop))
			return new ModelAndView("Delete").addObject("key", dao.getIds()).addObject("msg","Record Deleted Successfully");
		return new ModelAndView("Delete").addObject("key", dao.getIds()).addObject("msg", "Record Deleted Failure");
	}

	@RequestMapping("Update")
	public ModelAndView loadupdate() {
		return new ModelAndView("Update").addObject("key", dao.getIds());
	}
	@PostMapping("Fetch")
	public ModelAndView doFetch(@ModelAttribute("bean") Property prop) {
		
		System.out.println(prop);
		Property pro = dao.getProperty(prop);
		System.out.println(pro);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("bean",pro);
		mv.addObject("key", dao.getIds());
		return mv;
	}
	
	@PostMapping("UpdationProp")
	public ModelAndView doUpdate(@ModelAttribute("bean") Property prop) {
		if (dao.updateProperty(prop))
			return new ModelAndView("Update").addObject("key", dao.getIds()).addObject("msg","Record Updated Successfully");
		return new ModelAndView("Update").addObject("key", dao.getIds()).addObject("msg", "Record Updated Failure");
	}
	@RequestMapping("Find")
	public ModelAndView loadfind() {
		return new ModelAndView("Find").addObject("key", dao.getIds());
	}
	
	@PostMapping("FindProp")
	public ModelAndView doFind(@ModelAttribute("bean") Property p) {
		Property prop=dao.getProperty(p);
		if(prop!=null)
			return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("bean",prop);
		return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("msg","Record not found");
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		return new ModelAndView("FindAll").addObject("list",dao.getPropertysList());
	}
	
	
	@RequestMapping("doEdit")
	public ModelAndView doFindAll(@ModelAttribute("bean") Property prop) {
		dao.updateProperty(prop);
		return new ModelAndView("FindAll").addObject("list",dao.getPropertysList());
		
	}
	
	@RequestMapping("deletenow")
	public ModelAndView doDeleteNow(@RequestParam("bean") Integer id) {
		Property prop=new Property();
		prop.setPropId(id);
		dao.deleteProperty(prop);
		return new ModelAndView("FindAll").addObject("list",dao.getPropertysList());
	}
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(@ModelAttribute("bean") Property prop) {
		dao.insertProperty(prop);
		return new ModelAndView("FindAll").addObject("list",dao.getPropertysList());
	}

}
