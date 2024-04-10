package com.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BikeController {

	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}

	@RequestMapping("Link")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Link");
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsertBike() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}

	@RequestMapping("Update")
	public ModelAndView loadUpdateBike() {
		ModelAndView mv = new ModelAndView("Update");
		return mv;
	}

	@RequestMapping("Delete")
	public ModelAndView loadDeleteBike() {
		ModelAndView mv = new ModelAndView("Delete");
		return mv;
	}

	@RequestMapping("Find")
	public ModelAndView loadSearchBike() {
		ModelAndView mv = new ModelAndView("Find");
		return mv;
	}
	
	

	@RequestMapping("Insertion")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("InsertSuccess");
		return mv;
	}

	@RequestMapping("Deletion")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("DeleletSuccess");
		return mv;
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		ModelAndView mv = new ModelAndView("FindAll");
		return mv;
	}
}
