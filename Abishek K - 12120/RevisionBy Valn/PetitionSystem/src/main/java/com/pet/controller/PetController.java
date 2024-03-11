package com.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pet.bean.Petition;
import com.pet.dao.PetDao;

@Controller
public class PetController {
	
	@Autowired
	PetDao dao;

	
	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}
	
	@RequestMapping("Mainpage")
	public ModelAndView loadMainpage() {
		ModelAndView mv = new ModelAndView("Mainpage");
		return mv;
	}
	
	@RequestMapping("Navbar")
	public ModelAndView loadNavbar() {
		ModelAndView mv = new ModelAndView("Navbar");
		return mv;
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@PostMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean")Petition pet) {
		
		int n = dao.insertPetition(pet);
		ModelAndView mv = null;
		if(n>0) {
			mv = new ModelAndView("Insert");
			mv.addObject("Action","Success");
		}
		else {
			mv = new ModelAndView("Insert");
			mv.addObject("Action","Failure");
		}
		
		return mv;
		
		
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList =  dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("Action",null);
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Fetch")
	public ModelAndView loadFetch(@ModelAttribute("bean")Petition pet){
		
		
		int id = pet.getPetid();
		Petition emp = dao.fetchMethod(id);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("emp",emp);
		
		return mv;
		
	}
	
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Petition pet) {
		List<Integer> idList =  dao.idList();
		dao.updatePetition(pet);
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("IdList",idList);
		mv.addObject("Action","Success");
		return mv;
		
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		
		List<Integer> idList =  dao.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList",idList);
		return mv;
	}
	
	@PostMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Petition emp) {
		List<Integer> idList =  dao.idList();
		dao.deletePetition(emp);
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("Action","Success");
		mv.addObject("IdList",idList);
		return mv;
		
		
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		
		List<Integer> idList =  dao.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("IdList",idList);
		return mv;
		
	}
	
	@PostMapping("Findation")
	public ModelAndView doFind(@ModelAttribute("bean")Petition emp) {
		
		int id = emp.getPetid();
		List<Integer> idList =  dao.idList();
		Petition emp1 = dao.fetchMethod(id);
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("emp",emp1);
		mv.addObject("IdList",idList);
		return mv;
		
		
		
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("list",list);
	
		mv.addObject("msg","FindAll");
		return mv;
	}
	
	@PostMapping("Edit")
	public ModelAndView loadedit(@ModelAttribute("rdata")Petition emp) {
		
		int id = emp.getPetid();
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("list",list);
		mv.addObject("id",id);
		mv.addObject("msg","Edit");
		return mv;
	}
	
	@PostMapping("Save")
	public ModelAndView doEdit(@ModelAttribute("data")Petition emp) {
		
		dao.updatePetition(emp);
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("list",list);
		mv.addObject("msg","FindAll");
		return mv;
	}
	
	@PostMapping("Remove")
	public ModelAndView doRemove(@ModelAttribute("rdata")Petition emp) {
		
		dao.deletePetition(emp);
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("list",list);
		mv.addObject("msg","FindAll");
		return mv;
	}
	
	@PostMapping("NewElem")
	public ModelAndView loadNew() {
		
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("msg","New");
		mv.addObject("list",list);
		return mv;
	}
	
	@PostMapping("New")
	public ModelAndView doNew(@ModelAttribute("bean")Petition emp) {
		
		dao.insertPetition(emp);
		List<Petition> list = dao.findallPetition();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("msg","FindAll");
		mv.addObject("list",list);
		return mv;
	}
}
