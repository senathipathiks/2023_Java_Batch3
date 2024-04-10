package com.opms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opms.bean.Petition;
import com.opms.dao.PetitionDAO;


@Controller
public class PetitionController {
	
	@Autowired
	PetitionDAO dao;
	
	@GetMapping("HeadingPage")
	public ModelAndView loadHeading() {
		return new ModelAndView("HeadingPage");
	}
	
	@GetMapping("insert")
	public ModelAndView loadInsert() {
		return new ModelAndView("Insert");
	}
	
	@GetMapping("update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("Update").addObject("keys",dao.getIdList());
	}
	
	@GetMapping("search")
	public ModelAndView loadSearch() {
		return new ModelAndView("Search").addObject("keys",dao.getIdList());
	}
	
	@GetMapping("delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("Delete").addObject("keys",dao.getIdList());
	}
	
	@GetMapping("home")
	public ModelAndView loadHome() {
		return new ModelAndView("Home").addObject("list",dao.getPetitionList());
	}
	
	@PostMapping("InsertPetition")
	public ModelAndView doinsert(@ModelAttribute("beanclass")Petition p) {
		
		if(dao.insertPetition(p))
			return new ModelAndView("Insert").addObject("msg", "success");
		
		return new ModelAndView("Insert").addObject("msg", "failure");
	}
	
	@PostMapping("fetch")
	public ModelAndView doFetch(@ModelAttribute("beanclass1")Petition v) {
		if(dao.getPetition(v)!= null)
			return new ModelAndView("Update").addObject("bean", dao.getPetition(v)).addObject("keys",dao.getIdList());
		
		return new ModelAndView("Update").addObject("keys",dao.getIdList());
	}
	
	@PostMapping("UpdatePetition")
	public ModelAndView doUpdate(@ModelAttribute("beanclass2")Petition v) {
		
		if(dao.updatePetition(v))
			return new ModelAndView("Update").addObject("keys",dao.getIdList()).addObject("msg", "success");
		
		return new ModelAndView("Update").addObject("keys",dao.getIdList()).addObject("msg", "failure");
	}
	
	@PostMapping("SearchPetition")
	public ModelAndView doSearch(@ModelAttribute("beanclass")Petition v) {
		
		if(dao.getPetition(v)!= null)
			return new ModelAndView("Search").addObject("keys",dao.getIdList()).addObject("msg", "success").addObject("bean", dao.getPetition(v));
		
		return new ModelAndView("Search").addObject("keys",dao.getIdList()).addObject("msg", "failure");
	}
	
	@PostMapping("DeletePetition")
	public ModelAndView doDelete(@ModelAttribute("beanclass")Petition v) {
		
		if(dao.deletePetition(v))
			return new ModelAndView("Delete").addObject("keys",dao.getIdList()).addObject("msg", "success");
		
		return new ModelAndView("Delete").addObject("keys",dao.getIdList()).addObject("msg", "failure");
	}
	

	@GetMapping("findall")
	public ModelAndView doAction(@RequestParam("action") String action,@RequestParam("vehicleId") Integer id) {
		
		if(action.equals("edit")) {
			Petition v = new Petition();
			v.setPetitionId(id);
			return new ModelAndView("Home").addObject("list",dao.getPetitionList()).addObject("bean", dao.getPetition(v));
			
		}else if(action.equals("delete")) {
			Petition v = new Petition();
			v.setPetitionId(id);
			dao.deletePetition(v);
			return new ModelAndView("Home").addObject("list",dao.getPetitionList());
		}
		
		return new ModelAndView("Home").addObject("list",dao.getPetitionList());
		
	}
	
	@PostMapping("SaveUpdate")
	public ModelAndView doSave(@ModelAttribute("beanclass1")Petition v) {
		dao.updatePetition(v);
		return new ModelAndView("Home").addObject("list",dao.getPetitionList());
	}
	
	@GetMapping("back")
	public ModelAndView doBack() {
		return new ModelAndView("Home").addObject("list",dao.getPetitionList());
	}
	
	@PostMapping("AddPetition")
	public ModelAndView doAdd(@ModelAttribute("beanclass2")Petition v) {
		dao.insertPetition(v);
		return new ModelAndView("Home").addObject("list",dao.getPetitionList());
	}
}

